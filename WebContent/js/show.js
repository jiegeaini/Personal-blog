var loc = location.href;
var n1 = loc.length;//地址的总长度
var n2 = loc.indexOf("=");//取得=号的位置
var id = loc.substr(n2+1, n1-n2);//从=号后面的内容

var a = "error";
var url = "getAll_c";
var list;
var GetList = function () {
	$.ajax({
		type:"get",
	    url: url,
	    data:{id:id},
	    dataType: "json",
		async: false,
		success: function(data) {
			list = data;
		},
		error:function(){
			$("#showpage").removeClass("active");
			error();
		}
		})
}

GetList();

if(list != null){
	new Vue({
	    el: '#content_body',
	    data: {
	        content:list
	    }
	  })
}

window.onload=function(){
	
	if(list == null){
		$("#showpage").removeClass("active");
		error();
	}else{
		$("#showpage").removeClass("active");
		$("#contextWrap").transition('drop');
		
		$(".column.showpage_url").click(function(){
			var url = $(this).children("span").text();
			window.open(url,"_self")
		})
	}
	
}

var error = function(){
	swal({
        title: "网络错误",
        text: "你没有适当的链接页面",
        type: a,
        showCancelButton: true,
        confirmButtonColor: "#DD6B55",
        closeOnConfirm: false,
        closeOnCancel: false
    }, function (a) {
        if (a) swal("Deleted!", "Your imaginary file has been deleted.", "success"); else swal("Cancelled", "Your imaginary file is safe :)", "error");
    });
}
