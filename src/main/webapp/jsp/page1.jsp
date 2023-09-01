<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String contact= (String) application.getAttribute("contact");
%>
<p>Contact us: <%= contact %></p>

</body>
</html>
