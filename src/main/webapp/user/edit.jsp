<%@ page import="com.ky.model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="head.jsp" %>
    <title>User Registration</title>
</head>
<body>
<%@include file="nav.jsp" %>
<%
    User user = (User) request.getAttribute("user");
%>
<div class="container">
    <h3>User Details</h3>
    <form action="user-edit" method="post">
        <input type="hidden" name="id" value="<%= user.getId() %>">
        <input type="text" name="username" placeholder="Username" value="<%= user.getUsername() %>" required>
        <br><br>
        <input type="password" name="password" value="<%= user.getPassword() %>" placeholder="Password">
        <br><br>
        <button type="submit">Update</button>
    </form>
</div>
</body>
</html>
