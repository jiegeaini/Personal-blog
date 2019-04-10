

var a = "error";
var url = "getAll_comment";
var number = 1;
var list;
var GetList = function () {
	$.ajax({
		type:"get",
		data:{number:number},
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
	    el: '#content_comment',
	    data: {
	        comment:list
	    },
	    methods:{
	          next: function(){
	        	  number++;
	        	  GetList();
	        	  if(list.length != 0){
	        		  this.comment = list;  
	        	  }else{
	        		  number--;
	        	  }
	          },
	          pre:function(){
	        	  number--;
	        	  GetList();
	        	  if(list.length != 0){
	        		  this.comment = list;  
	        	  }else{
	        		  number++;
	        	  }
	          },
	          tz:function(){
	        	  var num = $("#tiao").val();
	        	  if(num > 0){
	        		  var past = number;
	        		  number = num;
	        		  GetList();
	        		  if(list.length != 0){
		        		  this.comment = list;  
		        	  }else{
		        		  number = past;
		        	  }
	        	  }
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

