<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/7/26
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员页面</title>
</head>
<body>
<table>
    <tr>
        <td>用户id</td>
        <td>用户姓名</td>
        <td>用户age</td>
    </tr>
    <c:forEach items="${list}" var="user">
        <td>${user.id}</td>
        <td>${user.username}</td>
        <td>${user.age}</td>
    </c:forEach>
</table>
</body>
</html>
