<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>auth</title>
</head>
<body>

<%
    String username=request.getParameter("username");
    String password=request.getParameter("password");
    if(username.equals("admin")&&password.equals("a123")){
        out.print("login successfully");
    }else{
        out.print("Invalid username or password");
    }
%>

</body>
</html>
