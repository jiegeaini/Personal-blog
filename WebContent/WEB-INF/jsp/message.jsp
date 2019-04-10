<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>jie</title>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">
<link href="../semantic/dist/semantic.min.css" rel="stylesheet" />
<link href="../css/ionicons.min.css" rel="stylesheet" />
<link href="../css/main.css?s=4" rel="stylesheet" />
<link href="../css/pace.css" rel="stylesheet" />

</head>
<body>
	<div id="contextWrap">
		<!--sidebar-->
		<div
			class="ui sidebar vertical left menu overlay  borderless visible sidemenu inverted  grey"
			style="-webkit-transition-duration: 0.1s; transition-duration: 0.1s;"
			data-color="grey">
			<a class="item logo" href="index.html"> <img
				src="../img/logo.jpg" alt="stagblogo" /><img src="../img/tou.jpg"
				alt="stagblogo" class="displaynone" />
			</a>
			<div class="ui accordion inverted">
				<div class="title item">
					<i class="dropdown icon"></i> 文章管理
				</div>
				<div class="content">
					<a class="item" href="getIndex"> 文章 </a> <a class="item"
						href="getAddPage"> 文章增加 </a> <a class="item" href="getCategory">
						文章分类 </a> <a class="item" href="getAddCategory"> 分类增加 </a>
				</div>
				<div class="title item">
					<i class="dropdown icon"></i> 问题管理
				</div>
				<div class="content">
					<a class="item" href="getQuestion"> 问题 </a> <a class="item"
						href="getAddQuestion"> 问题增加 </a> <a class="item" href="getMessage">
						问题信息 </a> <a class="item" href="getAddMessage"> 问题信息增加 </a>
				</div>

				<div class="title item">
					<i class="dropdown icon"></i> 经验管理
				</div>
				<div class="content">
					<a class="item" href="getExperience"> 经验 </a> <a class="item"
						href="getAddExperience"> 经验增加 </a> <a class="item"
						href="getExperienceMess"> 经验信息 </a> <a class="item"
						href="getAddExperienceMess"> 经验信息增加 </a>
				</div>


				<div class="title item">
					<i class="dropdown icon"></i> 留言与图片
				</div>
				<div class="content">
					<a class="item" href="getComment"> 留言</a> <a class="item"
						href="getUploadImg"> 图片上传</a>
				</div>
				<div class="title item">
					<i class="dropdown icon"></i> 项目管理
				</div>
				<div class="content">
					<a class="item" href="getDownload"> 项目</a> <a class="item"
						href="getAddDownload"> 项目增加</a>
				</div>
			</div>

		</div>
		<!--sidebar-->

		<div class="pusher">
			<!--navbar-->
			<div class="navslide navwrap">
				<div class="ui menu icon borderless grid"
					data-color="inverted white">
					<a class="item labeled openbtn"> <i
						class="list layout large icon"></i>
					</a> <a class="item labeled expandit"
						onclick="toggleFullScreen(document.body)"> <i
						class="maximize large icon"></i>
					</a>

					<div class="right menu colhidden">

						<div class="ui dropdown item">
							<img class="ui mini circular image" src="../img/tou.jpg"
								alt="label-image" />
							<div class="menu">
								<a class="item" href="profile.html">Profile</a> <a class="item"
									href="settings.html">Settings</a>
								<div class="ui divider"></div>
								<a class="item" href="login.html">Sign Out</a>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!--navbar-->
			<!--maincontent-->
			<div class="mainWrap navslide">
				<div class="ui equal width left aligned padded grid stackable">
					<!--Site Content-->
					<!--Site Content-->

					<div class="row">
						<div class="sixteen wide column">
							<div class="ui segments">
								<div class="ui segment">
									<h5 class="ui header">Datatable</h5>
								</div>
								<div class="ui segment">
									<table id="data_table"
										class="ui compact selectable striped celled table tablet stackable"
										cellspacing="0" width="100%">
										<thead>
											<tr>
												<th>ID</th>
												<th>title</th>
												<th>text</th>
												<th>operation</th>
											</tr>
										</thead>

										<tbody>
											<c:forEach items="${content }" var="c">
												<tr>
													<td>${c.id }</td>
													<td>${fn:substring(c.title, 0, 10)}</td>
													<td>${fn:substring(c.text, 0, 5)}</td>
													<td><a href="getUpdateMessage?id=${c.id }"> <i
															class="write large icon"></i>
													</a> <a href="https://maguangjie.com/deleteMessage?id=${c.id }">
															<i class="trash outline large icon"></i>
													</a></td>
												</tr>
											</c:forEach>



										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!--maincontent-->
		</div>
	</div>



	<div id="imgShow" class="ui standard test modal">
		<div class="header">ÏêÇé</div>
		<div class="image content">
			<div class="ui segment">
				<img class="ui fluid image" src="img/bg/1.png">
			</div>
		</div>
		<div class="actions">
			<div class="ui black deny button">Close</div>
			<div class="ui positive right labeled icon button">
				Yes I Know <i class="checkmark icon"></i>
			</div>
		</div>
	</div>


	<!--jquery-->
	<script src="../js/jquery-2.1.4.min.js"></script>
	<!--jquery-->
	<!--semantic-->
	<script src="../semantic/dist/semantic.min.js"></script>
	<!--semantic-->

	<script src="../js/js.cookie.js"></script>
	<script src="../js/jquery.nicescroll.min.js"></script>
	<script data-pace-options='{ "ajax": false }' src="../js/pace.js"></script>
	<script src="../js/main.js"></script>
	<script src="../js/jquery.dataTables.js"></script>
	<script src="../js/custom-datatable.js"></script>
	<script>
    $("#haha").click(function(){
    	$('#imgShow').modal('show');
    })
    	
    </script>
</body>
</html>





