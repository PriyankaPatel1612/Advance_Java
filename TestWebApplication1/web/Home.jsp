<%-- 
    Document   : Home
    Created on : 12 Sep, 2023, 3:40:20 PM
    Author     : Priyanka Patel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>Welcome <%= session.getAttribute("username") %>!!!</h1>
    </body>
</html>
