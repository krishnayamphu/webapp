<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="../head.jsp" %>
    <title>Add Todo Item</title>
</head>
<body>
<%@include file="../nav.jsp" %>
<div class="container">
    <form action="todo-add" method="post">
        <input type="text" name="item" placeholder="Add Todo Item" required>
        <br><br>
        <button type="submit">Save</button>
    </form>
</div>
</body>
</html>
