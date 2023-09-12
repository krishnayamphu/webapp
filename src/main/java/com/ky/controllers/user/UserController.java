package com.ky.controllers.user;

import com.ky.dao.UserDAO;
import com.ky.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "UserController", value = "/users")
public class UserController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<User> users= UserDAO.getUsers();
        request.setAttribute("users",users);
        request.getRequestDispatcher("user/index.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("id"));
        UserDAO.remove(id);
        response.sendRedirect(request.getHeader("referer"));
    }
}
