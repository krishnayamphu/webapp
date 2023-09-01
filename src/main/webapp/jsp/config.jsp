<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String company=config.getInitParameter("company");
%>
<h2>Company Name: <%= company %></h2>

<%
    String user=application.getInitParameter("user");
%>
<h2>Username: <%= user %></h2>
</body>
</html>
