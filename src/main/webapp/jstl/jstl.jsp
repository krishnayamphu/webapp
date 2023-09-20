<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>JSTL</title>
</head>
<body>
<c:out value="Welcome to JSTL"/>
<c:set var="name" value="Aptech Computer Education" scope="request"/>
<p>
    Company name: <c:out value="${name}"/>
</p>
<hr>

<c:set var="age" value="20" scope="session"/>
<c:if test="${age>=18}">
    <p><c:out value="You can vote"/></p>
</c:if>

<hr>

<c:set var="eng" value="6" scope="session"/>
<c:choose>
    <c:when test="${eng>=40}">
        <p><c:out value="Pass"/></p>
    </c:when>
    <c:otherwise>
        <p><c:out value="Fail"/></p>
    </c:otherwise>
</c:choose>

<hr>

<c:forEach var="i" begin="1" end="5">
    <p><c:out value="${i}"/></p>
</c:forEach>

</body>
</html>
