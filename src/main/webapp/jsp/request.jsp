<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<%
    String username=request.getParameter("username");
    out.print(username);
    out.print(request.getRemoteUser()+"<br>");
    out.print(request.getServletPath()+"<br>");
    out.print(request.getRequestURI()+"<br>");
    out.print(request.getContextPath()+"<br>");
    out.print(request.getRemoteAddr()+"<br>");
    out.print(request.getRequestURI()+"<br>");
    out.print(request.getRemotePort()+"<br>");
    out.print(request.getRemoteHost());
%>
</body>
</html>
