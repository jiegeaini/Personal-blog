<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Standard Meta -->
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta content="initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no" name="viewport" />

    <!-- Site Properities -->
    <meta name="generator" content="Visual Studio 2015" />
    <title>jie</title>
    <meta name="description" content="Stagb Admin Template" />
    <meta name="keywords" content="html5, ,semantic,ui, library, framework, javascript,jquery,template,blog,stagb,template" />
    <link href="../semantic/dist/semantic.min.css" rel="stylesheet" />
    <link href="../css/main.css" rel="stylesheet" />
</head>
<body>
    <div class="ui container" style="padding-top:10%">
        <div class="ui grid center aligned">
            <div class="row">
                <div class="sixteen wide tablet six wide computer column">
                    <div class="ui left aligned segment">

                        <div id="form1" class="ui form">

                            <h1 class="ui header center aligned">
                                <img src="../img/tou.jpg" alt="stagblogo" class="ui small image">

                                <div class="content">

                                </div>
                            </h1>
						<form class="ui form" action="https://maguangjie.com/login">
                            <div class="field">
                                <label>
                                username
                                </label>
                                <div class="ui fluid icon input">
                                    <input name="name" id="u_name" type="text" autocomplete="off" style="width:100%!important;min-width:100%;width:100%;">
                                    <i class="icon mail outline"></i>
                                </div>
                            </div>
                            <div class="field">
                                <label>
                                    Password:
                                </label>
                                <div class="ui fluid icon input">
                                    <input name="password" id="u_pass" type="password" autocomplete="off" style="width:100%!important;min-width:100%;width:100%;">
                                    <i class="icon key"></i>
                                </div>
                            </div>
                            <div class="field">

                                <button class="ui teal submit right labeled icon button fluid">
                                    Login
                                    <i class="icon sign in"></i>
                                </button>
                            </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script src="../js/jquery-2.1.4.min.js"></script>

    <script>
        var colors = ["#F25F5C", "#247BA0", "#8e44ad", "#ED6A5A", "#32936F", "#2c3e50", "#E83F6F", "#32936F", "#2E294E"];
        var rand = Math.floor(Math.random() * colors.length);
        $('body').css("background-color", colors[rand]);
    </script>
</body>
</html>
