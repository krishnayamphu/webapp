package com.ky.servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("page/login.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String username=request.getParameter("username");
            String password=request.getParameter("password");
            if(username.equals("admin")&&password.equals("a123")){
                HttpSession session= request.getSession();
                session.setAttribute("user",username);
                response.sendRedirect("welcome");
            }else{
                String msg="Invalid username or password";
                request.setAttribute("err",msg);
                request.getRequestDispatcher("page/login.jsp").forward(request,response);

            }
    }
}
