package com.ky.controllers;

import com.ky.dao.TodoDAO;
import com.ky.model.Todo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "HomeController", value = "")
public class HomeController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Todo> items = TodoDAO.getItems();
        request.setAttribute("items", items);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
