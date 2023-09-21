package com.ky.controllers.todo;

import com.ky.dao.TodoDAO;
import com.ky.model.Todo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TodoAddController", value = "/todo-add")
public class TodoAddController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("todo/create.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String item=request.getParameter("item");
        TodoDAO.save(new Todo(item,false));
        response.sendRedirect("todo");
    }
}
