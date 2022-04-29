<%--
  Created by IntelliJ IDEA.
  User: 123
  Date: 2021/11/9
  Time: 19:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>文件</title>
  </head>
  <body>
    <form action="${pageContext.request.contextPath}/upload" enctype="multipart/form-data" method="post">
      <input type="file" name="file"/>
      <input type="submit">
    </form>

    <form action="${pageContext.request.contextPath}/upload2" enctype="multipart/form-data" method="post">
      <input type="file" name="file"/>
      <input type="submit" value="upload">
    </form>
  <br>
    <a href="${pageContext.request.contextPath}/download">点击下载</a>
  </body>
</html>
