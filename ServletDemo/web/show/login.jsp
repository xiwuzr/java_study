<%--
  Created by IntelliJ IDEA.
  User: 佳豪
  Date: 2019/10/13
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆界面</title>
</head>
<body>

<%
    String aa="";
    String ss=(String) request.getAttribute("msg");
    if(ss==null){
        ss=aa;
    }
%>
<h1>登陆</h1>

<form action="/login" method="post">
    <font color="red"><br/><%=ss%><br/></font>
    用户名:<input type="text" name="uname" /><br/>
    密 码:<input type="password" name="pwd" /><br/>
    <input type="submit" value="登陆" />

</form>

</body>
</html>
