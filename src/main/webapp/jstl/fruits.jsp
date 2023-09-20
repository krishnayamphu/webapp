<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Fruits</title>
</head>
<body>
<c:forEach var="fruit" items="${fruits}">
    <p>${fruit}</p>
</c:forEach>
</body>
</html>
