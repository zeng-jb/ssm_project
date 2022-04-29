<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script>
        function del() {
            if(!window.confirm("确定要删除吗？该操作不可逆！")){
                window.event.returnValue=false;
            }
        }
    </script>
</head>
<body>

<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>学生列表 —— 显示所有学生</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/student/toAdd">新增学生</a>
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/student/all">显示全部学生</a>
        </div>
        <div class="col-md-4 column"></div>
        <div class="col-md-4 column">
            <form action="${pageContext.request.contextPath}/student/queryStudentChoose" method="post" style="float: outside">
                <select class="color-bar" name="op">
                    <option value="sid">学号</option>
                    <option value="sname">姓名</option>
                    <option value="age">年龄</option>
                    <option value="sex">性别</option>
                </select>
                <input type="text" name="queryStudentchoose" class="form-inline" placeholder="请输入要查询的信息">
                <input type="submit" name="查询" class="btn btn-primary">
                <span style="color: red; font-weight:bold;">${error}</span>
            </form>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>学生学号</th>
                    <th>学生姓名</th>
                    <th>年龄</th>
                    <th>性别</th>
                    <th>操作</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="student" items="${requestScope.get('list')}">
                    <tr>
                        <td>${student.getSid()}</td>
                        <td>${student.getSname()}</td>
                        <td>${student.getAge()}</td>
                        <td>${student.getSex()}</td>
                        <td>
                            <a class="btn btn-primary" href="${pageContext.request.contextPath}/student/toUpdate?sid=${student.getSid()}">更改</a>
                            <a class="btn btn-primary"  onclick="del()" href="${pageContext.request.contextPath}/student/delStudent?id=${student.getSid()}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>