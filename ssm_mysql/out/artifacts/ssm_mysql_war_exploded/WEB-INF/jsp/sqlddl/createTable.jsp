<%--
  Created by IntelliJ IDEA.
  User: 123
  Date: 2021/11/16
  Time: 17:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
</head>
<body>
    <form action="${pageContext.request.contextPath}/sql/create" method="post">
<%--        <input name="sql" type="text" placeholder="输入完整的建表sql语言" style="height: 300px ;width: 300px">--%>
        <textarea cols="30" rows="20" id="ssv3-main-text" name="sql">在此输入完整建表语言</textarea>
        <input type="submit" value="提交" class="btn btn-primary">
    </form>
</body>
</html>
