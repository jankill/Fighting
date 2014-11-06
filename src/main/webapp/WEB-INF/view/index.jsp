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
          href="${pageContext.request.contextPath}/css/bootstrap.min.simplex.css"
          type="text/css">
    <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

</head>
<body>

<div class="navbar navbar-default">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse"
                    data-target=".navbar-responsive-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Brand</a>
        </div>
        <div class="navbar-collapse collapse navbar-responsive-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Active</a></li>
                <li><a href="#">Link</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Action</a></li>
                        <li><a href="#">Another action</a></li>
                        <li><a href="#">Something else here</a></li>
                        <li class="divider"></li>
                        <li class="dropdown-header">Dropdown header</li>
                        <li><a href="#">Separated link</a></li>
                        <li><a href="#">One more separated link</a></li>
                    </ul>
                </li>
            </ul>
            <form class="navbar-form navbar-left">
                <input type="text" class="form-control col-lg-8" placeholder="Search">
            </form>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">Link</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Action</a></li>
                        <li><a href="#">Another action</a></li>
                        <li><a href="#">Something else here</a></li>
                        <li class="divider"></li>
                        <li><a href="#">Separated link</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</div>

<div class="container">
    <div class="row">
        <div class="col-xs-12 col-md-8">
            <div>
            <h2><a target="_blank" href="http://www.mmamania.com/2014/9/11/6135743/latest-ufc-fight-night-55-fight-card-rumors-rockhold-bisping-sydney-australia-nov-8-fight-pass-mma">UFC Fight Night 55: 'Rockhold vs. Bisping'</a></h2>
            <
            </div>
                <ul class="media-list">
                <li class="media">
                    <a class="media-left" href="#">
                        <img src="${pageContext.request.contextPath}/images/rock-bis-poster.jpg" alt="...">
                    </a>

                    <div class="media-body">
                        <h4 class="media-heading">Media heading</h4>
                        ...
                    </div>
                </li>
                <li class="media">
                    <a class="media-left" href="#">
                        <img src="${pageContext.request.contextPath}/images/rock-bis-poster2.jpg" alt="...">
                    </a>

                    <div class="media-body">
                        <h4 class="media-heading">Media heading</h4>
                        ...
                    </div>
                </li>
                <li class="media">
                    <a class="media-left" href="#">
                        <img src="${pageContext.request.contextPath}/images/55-short_medium.jpg" alt="...">
                    </a>

                    <div class="media-body">
                        <h4 class="media-heading">Media heading</h4>
                        ...
                    </div>
                </li>
                <li class="media">
                    <a class="media-left" href="#">
                        <img src="${pageContext.request.contextPath}/images/4.jpg" alt="...">
                    </a>

                    <div class="media-body">
                        <h4 class="media-heading">Media heading</h4>
                        ...
                    </div>
                </li>
                <li class="media">
                    <a class="media-left" href="#">
                        <img src="${pageContext.request.contextPath}/images/5.jpg" alt="...">
                    </a>
                    <div class="media-body">
                        <h4 class="media-heading">Media heading</h4>
                        ...
                    </div>
                </li>
            </ul>
        </div>


        <div class="col-xs-6 col-md-4">
            <div>
                <table class="table table-striped table-bordered table-responsive table-hover table-condensed">
                    <c:forEach items="${users}" var="user">
                        <tr>
                            <td><c:out value="${user.uid}"/></td>
                            <td><c:out value="${user.fighter}"/></td>
                            <td><c:out value="${user.fighterPass}"/></td>
                            <td><c:out value="${user.account}"/></td>
                            <td><c:out value="${user.create_date}"/></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>
</div>
</body>

</html>
