package com.ky.controllers.user;

import com.ky.dao.UserDAO;
import com.ky.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginController", value = "/user-login")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("user/login.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        if(UserDAO.authUser(new User(username,password))){
            HttpSession session=request.getSession();
            session.setAttribute("user",username);
            response.sendRedirect("users");
        }else{
            String msg="Invalid username or password";
            request.setAttribute("err",msg);
            request.getRequestDispatcher("user/login.jsp").forward(request,response);
        }
    }
}
