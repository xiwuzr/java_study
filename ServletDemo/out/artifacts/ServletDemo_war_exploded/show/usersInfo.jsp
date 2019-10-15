<%--
  Created by IntelliJ IDEA.
  User: 佳豪
  Date: 2019/10/13
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" import="java.util.ArrayList,java.util.List,com.User" language="java" %>
<%@ page import="com.mysql.cj.Session,java.util.ArrayList,java.util.List,com.User" %>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
<table>
    <% ArrayList list=(ArrayList)request.getAttribute("users");
        if(list==null){
            out.print("没有用户信息");
        }else
        {
            for(int i=0;i<list.size();i++){
                User user=(User)list.get(i);

    %>
    <tr>
        <td>编号</td>
        <td>姓名</td>
    </tr>
    <tr>
        <td><%=user.getId()%></td>
        <td><%=user.getUname()%></td>
        <td><a href="/delete?id=<%=user.getId()%>">删除</a> | <a href="/change?id=<%=user.getId()%>">修改</a></td>
    </tr>
    <%
            }
        }
    %>
    <tr>
        <a href="/show/addUser.jsp">添加用户</a>
    </tr>
</table>




</body>
</html>