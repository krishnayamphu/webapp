package com.example.webapp.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username =request.getParameter("username");
        String password=request.getParameter("password");

        if(username.equalsIgnoreCase("admin") && password.equals("a123")){
            response.getWriter().print("Login success");
        }else{
            HttpSession session=request.getSession();
            session.setAttribute("err","Invalid username or password");
            response.sendRedirect("login.jsp");
        }

    }
}
