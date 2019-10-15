<%--
  Created by IntelliJ IDEA.
  User: 佳豪
  Date: 2019/10/13
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
<form method="post" action="/addUser">
    账号：<input type="text" name="id">
    姓名：<input type="text" name="uname">
    密码：<input type="password" name="pwd">
    <input type="submit" value="添加"/>
</form>
</body>
</html>
