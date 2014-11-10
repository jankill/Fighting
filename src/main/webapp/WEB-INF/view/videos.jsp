<%@ include file="header.jsp" %>
<div class="container">
    <div class="row">

        <ol class="breadcrumb">
            <c:forEach items="${menus}" var="menu">

                <li><a href=<c:out value="${pageContext.request.contextPath}/video/${menu.menuName}"/>><c:out
                        value="${menu.menuName}"/></a></li>

            </c:forEach>
        </ol>
    </div>
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
        </div>
    </div>
</div>
    </body>
    </html>
