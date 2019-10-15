package com.servlet;

import com.User;
import com.server.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "addUser",urlPatterns = {"/addUser"})
public class AddUserServlet extends HttpServlet {
    UserService us=new UserService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("uname");
        System.out.println(name);
        String a=request.getParameter("id");
        int id=Integer.valueOf(a);
        String pwd=request.getParameter("pwd");
        User user=new User(id,name,pwd);
        us.addUser(user);
        response.sendRedirect("/showall");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
