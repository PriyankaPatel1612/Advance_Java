
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body bgcolor="#D5F3FE">  
        <%
            String username = (String)session.getAttribute("username");
            if(username==null)
            {
                response.sendRedirect("Login.html");
            }
        %>
        <h1>Hello <%=username%>!!</h1
        
        <button><a href="logout.jsp">Sign Out</a></button>
    </body>
</html>
