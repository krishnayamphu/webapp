<%@ page import="java.time.LocalDateTime" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp</title>
</head>
<body>


<%
    int x=5;
%>
<p>Value of x: <%= x %></p>
<p>Current Date: <%= LocalDateTime.now() %></p>

</body>
</html>
