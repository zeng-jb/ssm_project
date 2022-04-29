<%--
  Created by IntelliJ IDEA.
  User: 123
  Date: 2021/11/9
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<h1>登录界面</h1>
<hr>
<body>
    <form action="${pageContext.request.contextPath}/user/login" >
        用户名：<input type="text" name="username"> <br>
        密码：<input type="text" name="pwd"> <br>
        <input type="submit" value="登录">
    </form>
</body>
</html>
