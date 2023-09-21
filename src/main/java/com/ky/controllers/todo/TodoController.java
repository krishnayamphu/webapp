package com.ky.controllers.todo;

import com.ky.dao.TodoDAO;
import com.ky.model.Todo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "TodoController", value = "/todo")
public class TodoController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Todo> items = TodoDAO.getItems();
        request.setAttribute("items", items);
        request.getRequestDispatcher("todo/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        TodoDAO.remove(id);
        response.sendRedirect("todo");
    }
}
