package com.servlet;

import com.User;
import com.server.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ChangeServlet",urlPatterns = {"/change2"})
public class ChangeServlet extends HttpServlet {
    UserService us=new UserService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("id"));
       // System.out.println(id);
        String name=request.getParameter("name");
        //System.out.println(name);
        String pwd=request.getParameter("pwd");
       // System.out.println(pwd);
        us.changeUser(id,name,pwd);
        response.sendRedirect("/showall");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
