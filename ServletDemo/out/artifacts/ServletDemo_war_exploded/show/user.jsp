<%--
  Created by IntelliJ IDEA.
  User: 佳豪
  Date: 2019/10/13
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="com.User" %>
<html>
<head>
    <title>个人中心</title>
</head>
<body>
<h2>我的信息</h2>

<%
    User user=(User)session.getAttribute("user");
    int a=user.getId();
    String name=user.getUname();
%>

<br/>
<table>
    <tr>
        <td>编号</td>
        <td>姓名</td>
    </tr>
    <tr>
        <td><%=a%></td>
        <td><%=name%></td>
        <td><a href="">修改</a> | <a href="/delete?id=<%=a%>">删除</a></td>
    </tr>
</table>
</body>
</html>
