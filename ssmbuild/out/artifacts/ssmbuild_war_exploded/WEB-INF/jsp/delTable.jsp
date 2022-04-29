<%--
  Created by IntelliJ IDEA.
  User: 123
  Date: 2021/11/16
  Time: 19:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除表</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/sql/del" method="post">
        <input type="text" placeholder="删除的表名" name="tableName">
        <input type="submit" value="提交">
    </form>
${msg}
</body>
</html>
