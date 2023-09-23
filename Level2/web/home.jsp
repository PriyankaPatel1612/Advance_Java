<%-- 
    Document   : home
    Created on : 24 Sep, 2023, 3:33:09 AM
    Author     : Priyanka Patel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>home</title>
    </head>
    <body>
        <a href="logout.jsp">Sign Out</a>
        <%
            String username = (String)session.getAttribute("username");
            if(username==null)
            {
                response.sendRedirect("login.html");
            }
        %>
        <h1>Welcome <%=session.getAttribute("username")%>..!!!</h1>
    </body>
</html>
