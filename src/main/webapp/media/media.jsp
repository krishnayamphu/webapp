<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Upload File</title>
    <style>
        img{
            height: 100px;
            width: 100px;
            object-fit: cover;
            margin: 15px;
            display: inline-block;
        }
        img:hover{
            opacity: 0.9;
            transition: all 1s;
        }
    </style>
</head>
<body>
<%
    ArrayList<String> files= (ArrayList<String>) request.getAttribute("files");
    for(String item: files){
        out.print("<img src='uploads/"+item+"'>");
    }
%>
</body>
</html>
