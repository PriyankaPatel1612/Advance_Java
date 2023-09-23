<%-- 
    Document   : logout
    Created on : 24 Sep, 2023, 2:39:53 AM
    Author     : Priyanka Patel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>logout</title>
    </head>
    <body>
        <%
            session.invalidate();
            response.sendRedirect("login.html");
        %>
    </body>
</html>
