<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">

    <title>Welcome</title>

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/css/bootstrap.min.css"
          type="text/css">
    <script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/stickUp.min.js"></script>
    <script type="text/javascript">
        jQuery(function ($) {
        $(document).ready(function () {
            $('.navbar-wrapper').stickUp();
        });
    }); </script>

    <style>
        /*.mod_line {
            background: #D9230F;
            height: 1px;
            margin-top: 25px;
            margin-bottom: 25px;
            overflow: hidden;
        }*/

        .row {
            margin-bottom: 25px;
        }
    </style>
</head>
<body>
<div class="navbar-wrapper">

    <nav class="navbar navbar-default" role="navigation">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                        data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href=<c:out value="${pageContext.request.contextPath}/index"/>>格斗爱好者</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li class="active"><a href=<c:out
                            value="${pageContext.request.contextPath}/schedule"/>>赛事预告</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">赛事视频 <span
                                class="caret"></span></a>
                        <ul class="dropdown-menu" role="menu">
                            <li><a href="<c:out value="${pageContext.request.contextPath}/videos/mma"/>">综合格斗(MMA)</a>
                            </li>
                            <li><a href="<c:out value="${pageContext.request.contextPath}/videos/kickboxing"/>">自由搏击</a>
                            </li>
                            <li>
                                <a href="<c:out value="${pageContext.request.contextPath}/videos/boxing"/>">拳击</a>
                            </li>
                        </ul>
                    </li>
                </ul>

                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#">Link</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <span
                                class="caret"></span></a>
                        <ul class="dropdown-menu" role="menu">
                            <li><a href="#">Action</a></li>
                            <li><a href="#">Another action</a></li>
                            <li><a href="#">Something else here</a></li>
                            <li class="divider"></li>
                            <li><a href="#">Separated link</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>
</div>

