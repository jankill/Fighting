<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>

       <%-- <link href="//maxcdn.bootstrapcdn.com/bootswatch/3.2.0/superhero/bootstrap.min.css" rel="stylesheet">--%>
        <link href="//maxcdn.bootstrapcdn.com/bootswatch/3.2.0/slate/bootstrap.min.css" rel="stylesheet">

        <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
        <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>

        <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
        <script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>

    </head>
	<body>
		<c:url value="/showMessage.html" var="messageUrl" />
		<a href="${messageUrl}">Click to enter</a>
	</body>

</html>
