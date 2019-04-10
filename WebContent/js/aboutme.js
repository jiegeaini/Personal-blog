

var a = "error";
var url = "getAll_aboutme";
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
			$('#ascrail2001-hr').transition('browse');
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
	}else{
		$("#showpage").removeClass("active");
		$("#contextWrap").transition('drop');
		
		$(".ui.link.fluid.card").click(function(){
			var id = $(this).children("span").text();
			switch(id){
			case "1":
			  window.open("https://mp.weixin.qq.com/s/SQLngaig0vPZnGxqddrALA","self")
			  break;
			case "2":
			  window.open("me.html","self")
			  break;
			default:
				 swal({
				        title: '扫一扫关注哦',
				        html: $('<div>')
				          .addClass('some-class')
				          .text('关注公众号与小程序，精彩内容更多哦'),
				        animation: false,
				        customClass: 'animated tada'
				    });

				    $('.swal2-modal')
				  .transition('tada')
				    ;
			}
			 
		})
	}
	
}
