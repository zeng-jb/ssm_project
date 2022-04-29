<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
  <title>首页</title>
  <style type="text/css">
    a {
      text-decoration: none;
      color: black;
      font-size: 36px;
    }
    h3 {
      width: 360px;
      height: 68px;
      margin: 200px auto;
      text-align: center;
      line-height: 68px;
      background: deepskyblue;
      border-radius: 8px;
    }
  </style>
</head>
<body>

<h3>
  <a href="${pageContext.request.contextPath}/student/all">SQLDML</a>
</h3>
<h3>
  <a href="${pageContext.request.contextPath}/sql/all">SQLDDL</a>
</h3>
</body>
</html>
