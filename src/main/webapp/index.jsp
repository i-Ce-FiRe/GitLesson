<html>
<body>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h2>欢迎登陆</h2>

<form action=${pageContext.request.contextPath}/user/login method="post">
    <table>
        <tr>
            <td>用户名</td>
            <td><input id="username" name="username" type="text"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input id="password" name="password" type="password"></td>
        </tr>
        <tr>
            <td><input value="登录" type="submit"></td>
        </tr>
    </table>
</form>
<a href="${pageContext.request.contextPath}/user/toAddUser">去注册</a>

</body>
</html>
