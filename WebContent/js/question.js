

var a = "error";
var url = "getAll_question";
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
	        	  window.open("showquestion.html?id="+id+"","self");
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

