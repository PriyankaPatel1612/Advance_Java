<%-- 
    Document   : Home
    Created on : 14 Sep, 2023, 8:07:21 PM
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
       
        <h1>Hello <%=session.getAttribute("username")%> </h1>
                
    </body>
</html>
