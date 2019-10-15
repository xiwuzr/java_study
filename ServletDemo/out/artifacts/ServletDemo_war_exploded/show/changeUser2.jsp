<%@ page import="com.User" %><%--
  Created by IntelliJ IDEA.
  User: 佳豪
  Date: 2019/10/15
  Time: 22:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改信息</title>
</head>
<body>
<%
    User user=(User)request.getAttribute("user");
%>
<h2>修改信息</h2>
<form method="post" action="/change2?id=<%=user.getId()%>">
    姓名：<input type="text" name="name" value="<%=user.getUname()%>"/>
    密码：<input type="password" name="pwd" value="<%=user.getPwd()%>" />
    <input type="submit" value="提交"/>
</form>

</body>
</html>
