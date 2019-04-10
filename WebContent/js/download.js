var url = "getAll_download";
var list;
var GetList = function () {
	$.ajax({
		type:"get",
	    url: url,
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

new Vue({
    el: '#content_body',
    data: {
        content:list
    },
    methods:{
        model: function(id){
        	window.location.href="http://localhost/wxdemo/download_project?id="+id+"";  
        }
    }
  })


window.onload=function(){
	
	if(list == null){
		$("#showpage").removeClass("active");
		 error();
	}else{
		$("#showpage").removeClass("active");
		$("#contextWrap").transition('drop');
	}
	
	$(".ui.link.card").click(function(){
		
	})
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

