<%--
  Created by IntelliJ IDEA.
  User: 佳豪
  Date: 2019/10/13
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户界面</title>
</head>
<body>

    <h2>功能选择</h2>

<form action="/show/user.jsp" method="post">
    <input type="submit" value="查看我的信息" align="center">
</form>
<br/>
    <form action="/showall" method="post">
        <input type="submit" value="查看所有人信息" align="center">
    </form>


</body>
</html>
