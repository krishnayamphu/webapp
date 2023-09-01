<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("contact","1234567",PageContext.APPLICATION_SCOPE);
    out.print("attribute set for application scope");
%>

</body>
</html>
