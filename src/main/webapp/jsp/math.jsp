<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page errorPage="exception.jsp" %>
<%
    int c=10/0;
    out.print("division of numbers is: "+c);
%>