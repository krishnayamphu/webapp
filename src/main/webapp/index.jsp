<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="head.jsp" %>
    <title>All Items</title>
</head>
<body>
<%@include file="nav.jsp" %>
<div class="container">
    <h3>All Todo Items</h3>
    <table>
        <tr>
            <th>SN</th>
            <th>Items</th>
            <th>Status</th>
            <th>Action</th>
        </tr>
        <c:forEach var="todo" items="${items}">
            <tr>
                <td>${todo.id}</td>
                <td>${todo.items}</td>
                <td><input type="checkbox" ${todo.status==true?'checked':''}></td>
                <td class="action">
                    <form method='post' action='todo-update'>
                        <input type="hidden" name="id" value="${todo.id}">
                        <button ${todo.status==true?'disabled':''}>Done</button>
                    </form>
                    <form method='post' action='todo'>
                        <input type="hidden" name="id" value="${todo.id}">
                        <button>Delete</button>
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
