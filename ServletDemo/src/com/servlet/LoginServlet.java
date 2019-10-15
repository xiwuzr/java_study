package com.servlet;

import com.User;
import com.server.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "login" ,urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
    UserService us=new UserService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pwd");
        User user=us.loginCheckService(uname,pwd);
        if(user!=null){
            HttpSession hs=request.getSession();
            hs.setAttribute("user",user);
            response.sendRedirect("/show/mainpage.jsp");///////////////转到成功页面
        }else{
            request.setAttribute("msg","用户名或密码错误");
            RequestDispatcher rd=request.getRequestDispatcher("/show/login.jsp");
            rd.forward(request,response);

        }
    }
}
