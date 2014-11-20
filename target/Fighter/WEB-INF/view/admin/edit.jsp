
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="../header.jsp"%>
<div class="container">
            <form class="form-horizontal" role="form" action="addPost" method="post">
                <div class="row">
                <div class="form-group">
                    <label for="inputTitle" class="col-md-2 control-label">标题</label>

                    <div class="col-md-6">
                        <input type="title" class="form-control" id="inputTitle">
                    </div>
                </div>
                </div>
                <div class="row">
                <div class="form-group">
                    <label for="inputActionUrl" class="col-md-2 control-label">链接</label>

                    <div class="col-md-6">
                        <input type="text" class="form-control" id="inputActionUrl">
                    </div>
                </div>
                    </div>
                <div class="row">
                <div class="form-group">
                    <label for="TextareaContent" class="col-md-2 control-label">内容</label>

                    <div class="col-md-6">
                        <textarea class="form-control" rows="3" id="TextareaContent"></textarea>
                    </div>
                </div>
                    </div>

                <div class="row">
                <div class="form-group">
                    <label for="selectCompetitionCatalog" class="col-md-2 control-label">赛事种类</label>

                    <div class="col-md-6">
                        <select class="form-control" id="selectCompetitionCatalog">
                            <option value="">1</option>

                        </select>
                    </div>
                </div>
                    </div>

                <div class="row">
                <div class="form-group">
                    <label for="selectCompetitionOrg" class="col-md-2 control-label">赛事组织</label>

                    <div class="col-md-6">
                        <select class="form-control" id="selectCompetitionOrg">
                            <option value="1">1</option>

                        </select>
                    </div>
                </div>
                    </div>

                <div class="row">
                <div class="form-group">
                    <label for="exampleInputFile" class="col-md-2 control-label">上传图片</label>
                    <div class="col-md-6">
                        <input type="file" id="exampleInputFile">
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
            </form>
</div>
<%@include file="../footer.jsp" %>
