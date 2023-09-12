<%@ page import="java.util.ArrayList" %>
<%@ page import="com.ky.model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Users</title>
    <style>
        table{
            border-collapse: collapse;
        }
        th,td{
            border: 1px solid darkgrey;
            padding: 5px 15px;
        }
    </style>
</head>
<body>
<h3>All Users</h3>
<table>
    <tr>
        <th>ID</th>
        <th>Username</th>
        <th>Password</th>
        <th>Action</th>
    </tr>
    <%
        ArrayList<User> users= (ArrayList<User>) request.getAttribute("users");
        for(User user:users){
            out.print("<tr>");
            out.print("<td>"+user.getId()+"</td>");
            out.print("<td>"+user.getUsername()+"</td>");
            out.print("<td>"+user.getPassword()+"</td>");
            out.print("<td><a href='user-edit?id=" +user.getId()+"'>Edit</a>"+
                    "<form method='post' action='users'>" +
                    "<input type='hidden' name='id' value="+user.getId()+
                            "> <button type='submit'>remove</button>"+
                    "</form></td>");
            out.print("</tr>");
        }
    %>
</table>
</body>
</html>
