<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>

       <%--<link href="//maxcdn.bootstrapcdn.com/bootswatch/3.2.0/superhero/bootstrap.min.css" rel="stylesheet">--%>
        <%--<link href="//maxcdn.bootstrapcdn.com/bootswatch/3.2.0/slate/bootstrap.min.css" rel="stylesheet">
        --%><link href="//maxcdn.bootstrapcdn.com/bootswatch/3.2.0/sandstone/bootstrap.min.css" rel="stylesheet">
        <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
       <%-- <link rel="stylesheet"
              href="<c:url value="/css/bootstrap.min.css"/>"
              type="text/css">--%>

        <script src="<c:url value="/js/jquery.min.js"/>"></script>

        <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
        <script src="<c:url value="/js/bootstrap.min.js"/>"></script>
       <%-- <style>
            body {
                background-color: #272B30
            }

            #iform {
                background-color: #1C1E22
            }

            #customNav {
                background-color: #363B3F
            }
        </style>--%>
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
    <div style="width: 400px; height: 400px" id="iform">
        <form class="form-horizontal">
            <fieldset>
                <legend>Legend</legend>
                <div class="form-group">
                    <label class="col-lg-2 control-label">Email</label>

                    <div class="col-lg-10">
                        <input type="text" class="form-control" id="inputEmail" placeholder="Email">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-2 control-label">Password</label>

                    <div class="col-lg-10">
                        <input type="password" class="form-control" id="inputPassword" placeholder="Password">

                        <div class="checkbox">
                            <label>
                                <input type="checkbox"> Checkbox
                            </label>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-2 control-label">Textarea</label>

                    <div class="col-lg-10">
                        <textarea class="form-control" rows="3" id="textArea"></textarea>
                        <span class="help-block">A longer block of help text that breaks onto a new line and may extend beyond one line.</span>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-2 control-label">Radios</label>

                    <div class="col-lg-10">
                        <div class="radio">
                            <label>
                                <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked="">
                                Option one is this
                            </label>
                        </div>
                        <div class="radio">
                            <label>
                                <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">
                                Option two can be something else
                            </label>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-2 control-label">Selects</label>

                    <div class="col-lg-10">
                        <select class="form-control" id="select">
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                        </select>
                        <br>
                        <select multiple="" class="form-control">
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-lg-10 col-lg-offset-2">
                        <button class="btn btn-default">Cancel</button>
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </div>
                </div>
            </fieldset>
        </form>
    </div>
    </body>

</html>
