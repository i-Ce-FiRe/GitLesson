<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/7/26
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员登录页面</title>
</head>
<body>
${error}
<form action=${pageContext.request.contextPath}/admin/login method="post">
    <tr>
        <td>管理员姓名</td>
        <td><input id="adminname" name="adminname" type="text"></td>
    </tr>
    <tr>
        <td>密码</td>
        <td><input id="password" name="password" type="password"></td>
    </tr>
    <tr>
        <td><input value="登录" type="submit"></td>
    </tr>
</form>
</body>
</html>
