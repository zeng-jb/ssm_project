<%--
  Created by IntelliJ IDEA.
  User: 123
  Date: 2021/11/8
  Time: 12:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>

    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.6.0.js"></script>
    <script>
<%--      Ajax  ;;;$   --%>
      function a() {
          $.post({
            url:"${pageContext.request.contextPath}/a1",
            data:{"name":$("#username").val()},
            success:function (data,status) {
                alert(data);
                console.log(data);
                console.log(status);
            }
          })
      }
    </script>
  </head>
  <body>
<%--      用户失去焦点时候，发起一个请求携带信息到后台--%>
    用户名：<input type="text" id="username" onblur="a()">
  </body>
</html>
