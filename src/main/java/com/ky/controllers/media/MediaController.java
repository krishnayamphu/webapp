package com.ky.controllers.media;

import com.ky.mediahelper.MediaFile;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "MediaController", value = "/media")
public class MediaController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path=getServletContext().getRealPath("/uploads");
        ArrayList<String> files= MediaFile.getFiles(path);
//        for(String item: files){
//            response.getWriter().print(item);
//        }
        request.setAttribute("files",files);
        request.getRequestDispatcher("media/media.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String item=request.getParameter("item");
    String path=getServletContext().getRealPath("/uploads/"+item);
    if(MediaFile.delete(path)){
        System.out.println("file deleted: "+path);
        response.sendRedirect("media");
    }
    }
}
