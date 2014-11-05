<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <meta charset="utf-8">
    <title>Welcome</title>

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <link rel="stylesheet"
          href="<c:url value="/css/bootstrap.min.css"/>"
          type="text/css">

    <script src="<c:url value="/js/jquery.min.js"/>"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="<c:url value="/js/bootstrap.min.js"/>"></script>

</head>
<body>
<div id="customNav"></div>
<div class="navbar navbar-default">
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

<div>

    <div class="media">
        <a class="media-left media-middle" href="#">
            <img data-src="..." alt="...">
        </a>
        <div class="media-body">
            <h4 class="media-heading">Middle aligned media</h4>
            ...
        </div>
    </div>

    <ul class="media-list">
        <li class="media">
            <a class="media-left" href="#">
                <img src="..." alt="...">
            </a>
            <div class="media-body">
                <h4 class="media-heading">Media heading</h4>
                ...
            </div>
        </li>
        <li class="media">
            <a class="media-left" href="#">
                <img src="..." alt="...">
            </a>
            <div class="media-body">
                <h4 class="media-heading">Media heading</h4>
                ...
            </div>
        </li>
        <li class="media">
            <a class="media-left" href="#">
                <img src="..." alt="...">
            </a>
            <div class="media-body">
                <h4 class="media-heading">Media heading</h4>
                ...
            </div>
        </li>
        <li class="media">
            <a class="media-left" href="#">
                <img src="..." alt="...">
            </a>
            <div class="media-body">
                <h4 class="media-heading">Media heading</h4>
                ...
            </div>
        </li>
        <li class="media">
            <a class="media-left" href="#">
                <img src="..." alt="...">
            </a>
            <div class="media-body">
                <h4 class="media-heading">Media heading</h4>
                ...
            </div>
        </li>
        <li class="media">
            <a class="media-left" href="#">
                <img src="" alt="...">
            </a>
            <div class="media-body">
                <h4 class="media-heading">Media heading</h4>
                ...
            </div>
        </li>
        </li>
    </ul>
</div>


<div>

    <table class="table table-striped table-bordered table-responsive table-hover table-condensed">
        <c:forEach items="${users}" var="user">

            <tr>
                <td><c:out value="${user.uid}"/></td>
                <td> <c:out value="${user.fighter}"/> </td>
                <td><c:out value="${user.fighterPass}"/></td>
                <td><c:out value="${user.account}"/></td>
                <td><c:out value="${user.create_date}"/></td>
            </tr>

        </c:forEach>

    </table>

</div>
</body>

</html>
