<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String user=application.getInitParameter("user");
%>
<h2>Username: <%= user %></h2>
</body>
</html>
