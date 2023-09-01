<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp</title>
</head>
<body>

<%!
    int getMaxBikeSpeed(){
        return 200;
    }
%>

<p>Maximum bike speed limit is: <%= getMaxBikeSpeed() %></p>
</body>
</html>
