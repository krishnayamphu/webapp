package com.ky.controllers.todo;

import com.ky.dao.TodoDAO;
import com.ky.model.Todo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TodoEditController", value = "/todo-update")
public class TodoEditController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Todo todo=new Todo();
        todo.setId(id);
        todo.setStatus(true);
        TodoDAO.update(todo);
        response.sendRedirect("todo");
    }
}
