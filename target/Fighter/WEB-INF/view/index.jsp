<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@include file="header.jsp" %>

<div class="container-fluid">
    <div class="row">
    <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
            <li data-target="#carousel-example-generic" data-slide-to="1"></li>
            <li data-target="#carousel-example-generic" data-slide-to="2"></li>
        </ol>

        <!-- Wrapper for slides -->
        <div class="carousel-inner" role="listbox">
            <div class="item active">
                <img src="${pageContext.request.contextPath}/images/ofc166.jpg" alt="..."/>
                <div class="carousel-caption">
                    ...
                </div>
            </div>
            <div class="item">
                <img src="${pageContext.request.contextPath}/images/b132.jpg" alt="..."/>
                <div class="carousel-caption">
                    FRIDAY, JAN. 16 LIVE ON SPIKE
                </div>
            </div>
            <div class="item">
                <img src="${pageContext.request.contextPath}/images/ufc182.jpg" alt="..."/>
                <div class="carousel-caption">
                    UFC 182: Jones vs. Cormier
                </div>
            </div>

        </div>

        <!-- Controls -->
        <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
    </div>
</div>
<div class="container">
    <div class="row">
        <h3>综合格斗(MMA)</h3>
    </div>
    <div class="row">
        <div class="col-xs-2 col-md-2">
            <img src="${pageContext.request.contextPath}/images/1.jpg" alt="..."/>
            <h4></h4>
        </div>
        <div class="col-xs-2 col-md-2">
            <img src="${pageContext.request.contextPath}/images/1.jpg" alt="..."/>
            <h4></h4>
        </div>
        <div class="col-xs-2 col-md-2">
            <img src="${pageContext.request.contextPath}/images/1.jpg" alt="..."/>
            <h4></h4>
        </div>
        <div class="col-xs-2 col-md-2">
            <img src="${pageContext.request.contextPath}/images/1.jpg" alt="..."/>
            <h4></h4>
        </div>
        <div class="col-xs-2 col-md-2">
            <img src="${pageContext.request.contextPath}/images/1.jpg" alt="..."/>
            <h4></h4>
        </div>
        <div class="col-xs-2 col-md-2">
        </div>
    </div>
<div class="row">
    <h3>自由搏击</h3>
</div>
    <div class="row">

        <div class="col-xs-2 col-md-2">
            <img src="${pageContext.request.contextPath}/images/1.jpg" alt="..."/>
            <h4></h4>
        </div>

        <div class="col-xs-2 col-md-2">
        </div>

    </div>

    <div class="row">
        <h3>拳击</h3>
    </div>
    <div class="row">

        <div class="col-xs-2 col-md-2">
            <img src="${pageContext.request.contextPath}/images/1.jpg" alt="..."/>
            <h4></h4>
        </div>

        <div class="col-xs-2 col-md-2">
        </div>

    </div>


</div>
<%@include file="footer.jsp"%>