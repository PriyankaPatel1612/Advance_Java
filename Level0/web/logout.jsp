<%-- 
    Document   : logout
    Created on : 23 Sep, 2023, 6:51:07 PM
    Author     : Priyanka Patel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout</title>
    </head>
    <body>
        <% 
            session.invalidate(); 
            response.sendRedirect("Login.html");
        %>
        <h1>Hello World!</h1>
    </body>
</html>
