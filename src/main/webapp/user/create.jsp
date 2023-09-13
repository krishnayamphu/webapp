<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="head.jsp" %>
    <title>User Registration</title>
</head>
<body>
<%@include file="nav.jsp" %>
<div class="container">
    <form action="add-user" method="post">
        <input type="text" name="username" placeholder="Username" required>
        <br><br>
        <input type="password" name="password" placeholder="Password">
        <br><br>
        <button type="submit">Register</button>
    </form>
</div>
</body>
</html>
