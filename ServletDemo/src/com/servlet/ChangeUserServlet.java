package com.servlet;

import com.User;
import com.server.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ChangeUserServlet",urlPatterns={"/change"})
public class ChangeUserServlet extends HttpServlet {
    UserService us=new UserService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.setCharacterEncoding("utf-8");
       response.setContentType("text/html;charset=utf-8");
       int id=Integer.parseInt(request.getParameter("id"));
//       request.setAttribute("id",id);
//       request.getRequestDispatcher("/show/changeUser.jsp").forward(request,response);
        User user=us.get(id);
        request.setAttribute("user",user);
        request.getRequestDispatcher("/show/changeUser2.jsp").forward(request,response);
    }
}
