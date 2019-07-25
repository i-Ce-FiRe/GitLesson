<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/7/20
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册失败</title>
</head>
<body>
<h1>注册失败</h1>
${error}
<a href="${pageContext.request.contextPath}/user/toLogin">重新注册</a>
</body>
</html>

