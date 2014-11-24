<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="../header.jsp" %>
<div class="container">
    <fieldset>
        <form:form modelAttribute="postForm" enctype="multipart/form-data" class="form-horizontal" role="form"
                   action="addPost" method="post">
        <div class="row">
            <div class="form-group">
                <label for="inputTitle" class="col-md-2 control-label">标题</label>

                <div class="col-md-6">
                    <form:input type="title" class="form-control" path="postTitle" id="inputTitle"></form:input>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group">
                <label for="inputActionUrl" class="col-md-2 control-label">链接</label>

                <div class="col-md-6">
                    <form:input path="postUrl" type="text" class="form-control" id="inputActionUrl"></form:input>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group">
                <label for="TextareaContent" class="col-md-2 control-label">内容</label>

                <div class="col-md-6">
                    <form:textarea path="postContent" class="form-control" rows="3"
                                   id="TextareaContent"></form:textarea>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="form-group">
                <label for="selectCompetitionCatalog" class="col-md-2 control-label">赛事组织</label>

                <div class="col-md-6">
                    <form:select path="orgId" class="form-control" id="selectCompetitionCatalog">
                        <form:option value="-" label="--Please Select"/>
                        <form:options items="${menuList}" itemValue="menuId" itemLabel="menuName"/>

                    </form:select>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="form-group">
                <label for="exampleInputFile" class="col-md-2 control-label">上传图片</label>

                <div class="col-md-6">
                    <form:input type="file" id="exampleInputFile" path="imageUrl"></form:input>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group">
                <div class="col-md-offset-2 col-md-10">
                    <button type="submit" class="btn btn-default">保存</button>
                </div>
            </div>
        </div>
        </form:form>
    </fieldset>
</div>
<%@include file="../footer.jsp" %>
