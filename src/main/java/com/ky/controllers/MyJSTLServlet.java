package com.ky.controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "MyJSTLServlet", value = "/my-jstl")
public class MyJSTLServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Banana");
        request.setAttribute("fruits",fruits);
        request.getRequestDispatcher("jstl/fruits.jsp").forward(request,response);
    }
}
