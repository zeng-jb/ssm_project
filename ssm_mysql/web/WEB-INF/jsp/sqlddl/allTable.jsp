<%--
  Created by IntelliJ IDEA.
  User: 123
  Date: 2021/11/16
  Time: 19:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>所有表格</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
</head>
<body>

${msg}

    <div class="col-md-4 colum" style="float: top">
        <tr>
        </tr>
        <div>
            <td>
                <a href="${pageContext.request.contextPath}/sql/toCreate" class="btn btn-primary">新建表</a>
            </td>
        </div>
        <br>
        <div >
            <td>
                <a href="${pageContext.request.contextPath}/sql/todel" class="btn btn-primary">删除表</a>
            </td>
        </div>
        <br>
        <div>
            <td>
                <form action="${pageContext.request.contextPath}/sql/judge" method="post">
                    <input type="text" name="tableName" placeholder="输入要查的表名">
                    <input type="submit" value="提交" class="btn btn-primary">
                </form>
            </td>
        </div>
        <br>
        <tr></tr>
    </div>


</body>
</html>
