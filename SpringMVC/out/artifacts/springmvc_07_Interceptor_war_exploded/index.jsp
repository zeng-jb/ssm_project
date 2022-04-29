<%--
  Created by IntelliJ IDEA.
  User: 123
  Date: 2021/11/9
  Time: 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>首页</h1>
  <hr>

    <a href="${pageContext.request.contextPath}/interceptor">控制器方法测试</a> <br>
    <a href="${pageContext.request.contextPath}/user/jumplogin">登录</a> <br>
    <a href="${pageContext.request.contextPath}/user/jumpSuccess">成功页面</a> <br>

  </body>
</html>
