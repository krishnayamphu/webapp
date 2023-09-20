<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Upload File</title>
    <style>
        .card{
            width: 100px;
            height: auto;
            display: flex;
            flex-direction: column;
            margin: 10px;
            justify-content: center;
            align-items: center;
            float: left;
        }
        img {
            height: 100px;
            width: 100px;
            object-fit: cover;
            margin-bottom: 15px;
            display: block;
        }

        img:hover {
            opacity: 0.9;
            transition: all 1s;
        }
    </style>
</head>
<body>
<%
    ArrayList<String> files = (ArrayList<String>) request.getAttribute("files");
    for (String item : files) {
        out.print("<div class='card'><a href='uploads/" + item + "'><img src='uploads/" + item + "'></a><form method='post' action='media'><input type='hidden' name='item' value='" + item + "'><input type='submit' value='Delete'></form></div>");
    }
%>
</body>
</html>
