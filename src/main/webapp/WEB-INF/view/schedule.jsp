
<%@include file="header.jsp" %>

<div class="container">
    <div class="row">

        <ol class="breadcrumb">
            <c:forEach items="${menus}" var="menu">

                <li><a href=<c:out value="${pageContext.request.contextPath}/video?org=${menu.menuName}"/>><c:out
                        value="${menu.menuName}"/></a></li>

            </c:forEach>
        </ol>
    </div>

    <div class="row">
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

</div>
</div>

</body>

</html>
