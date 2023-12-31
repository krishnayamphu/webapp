package com.ky.cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CookeiGetServlet", value = "/cookie-get")
public class CookeiGetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Cookie[] cookie=request.getCookies();
    for(Cookie ck:cookie){
        response.getWriter().print(ck.getName()+" = "+ck.getValue());
    }

    }
}
