package com.ky.cookies;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CookeiSetServlet", value = "/cookie-set")
public class CookeiSetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Cookie cookie=new Cookie("user","Administrator");
    response.addCookie(cookie);
    response.getWriter().print("cookie created successfully.");
    }
}
