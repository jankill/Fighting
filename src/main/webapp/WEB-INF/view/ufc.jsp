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
  <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>

  <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
  <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

</head>
<body>

<div class="container">

  <div class="row">
    <div class="col-xs-12 col-md-8">

      <ul class="media-list">
        <li class="media">
          <a class="media-left" href="#">
            <img src="${pageContext.request.contextPath}/images/1.jpg" alt="...">
          </a>

          <div class="media-body">
            <h4 class="media-heading">Media heading</h4>
            ...
          </div>
        </li>
        <li class="media">
          <a class="media-left" href="#">
            <img src="${pageContext.request.contextPath}/images/2.jpg" alt="...">
          </a>

          <div class="media-body">
            <h4 class="media-heading">Media heading</h4>
            ...
          </div>
        </li>
        <li class="media">
          <a class="media-left" href="#">
            <img src="${pageContext.request.contextPath}/images/3.jpg" alt="...">
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

      <div class="panel panel-default">
        <div class="panel-heading" role="tab" id="headingTwo">
          <h4 class="panel-title">
            <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo"
               aria-expanded="false" aria-controls="collapseTwo">
              UFC Fight Night 55: 'Rockhold vs. Bisping'
            </a>
          </h4>
        </div>
        <div id="collapseTwo" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo">
          <div class="panel-body">
            Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid.
            3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt
            laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin
            coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes
            anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings
            occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard
            of them accusamus labore sustainable VHS.
          </div>
        </div>
      </div>
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
