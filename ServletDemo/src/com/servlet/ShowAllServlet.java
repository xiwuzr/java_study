package com.servlet;

import com.User;
import com.server.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "showall" ,urlPatterns = {"/showall"})
public class ShowAllServlet extends HttpServlet {
    UserService us=new UserService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        List<User> list=null;
        list=us.getAll();
        request.setAttribute("users",list);
       request.getRequestDispatcher("/show/usersInfo.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        List<User> list=null;
        list=us.getAll();
        System.out.println(list);
        request.setAttribute("users",list);
        System.out.println(list);
        request.getRequestDispatcher("/show/usersInfo.jsp").forward(request,response);
    }
}
