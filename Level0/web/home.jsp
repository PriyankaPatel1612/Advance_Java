<%-- 
    Document   : home
    Created on : 23 Sep, 2023, 6:48:09 PM
    Author     : Priyanka Patel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body bgcolor="#D5F3FE">  
        <h1>Hello <%= session.getAttribute("username")%>!</h1
        
        <button><a href="logout.jsp">Sign Out</a></button>
    </body>
</html>
