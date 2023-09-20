<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.ky.model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="head.jsp" %>
    <title>All Users</title>
</head>
<body>
<%@include file="nav.jsp" %>
<div class="container">
    <h3>All Users</h3>
    <table>
        <tr>
            <th>ID</th>
            <th>Username</th>
            <th>Password</th>
            <th>Action</th>
        </tr>
        <%
            ArrayList<User> users = (ArrayList<User>) request.getAttribute("users");
            for (User user : users) {
                out.print("<tr>");
                out.print("<td>" + user.getId() + "</td>");
                out.print("<td>" + user.getUsername() + "</td>");
                out.print("<td>" + user.getPassword() + "</td>");
                out.print("<td class='action'><a href='user-edit?id=" + user.getId() + "'>Edit</a>" +
                        "<form method='post' action='users'>" +
                        "<input type='hidden' name='id' value=" + user.getId() +
                        "> <button type='submit'>remove</button>" +
                        "</form></td>");
                out.print("</tr>");
            }
        %>
    </table>

    <hr>
    <h3>All Users</h3>
    <table>
        <tr>
            <th>ID</th>
            <th>Username</th>
            <th>Password</th>
            <th>Action</th>
        </tr>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
                <td class="action">
                    <a href='user-edit?id=${user.id}'>Edit</a>
                    <form method='post' action='users'>
                        <input type="hidden" name="id" value="${user.id}">
                        <button>Delete</button>
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
