<%--
  Created by IntelliJ IDEA.
  User: 佳豪
  Date: 2019/10/14
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改信息</title>
</head>
<body>
<%
    int id=Integer.parseInt(request.getParameter("id"));
%>
    <h2>修改信息</h2>
    <form method="post" action="/change2?id=<%=id%>">
        姓名：<input type="text" name="name"/>
        密码：<input type="password" name="pwd"/>
        <input type="submit" value="提交"/>
    </form>

</body>

</html>
