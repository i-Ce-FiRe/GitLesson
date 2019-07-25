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
    <title>注册</title>
</head>
<body>
<form action=${pageContext.request.contextPath}/user/addUser method="post">
    <tr>
        <td>用户名</td>
        <td><input id="username" name="username" type="text"></td>
    </tr>
    <tr>
        <td>年龄</td>
        <td><input id="age" name="age" type="age"></td>
    </tr>
    <tr>
        <td>密码</td>
        <td><input id="password" name="password" type="password"></td>
    </tr>
    <tr>
        <td>确认密码</td>
        <td><input id="password2" name="password2" type="password"></td>
    </tr>
    <tr>
        <td><input value="注册" type="submit"></td>
    </tr>
</form>
</body>
</html>
