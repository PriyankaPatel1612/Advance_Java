

<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body bgcolor="cyan">
        <h1>Welcome <%= session.getAttribute("uname")%>!! </h1>
        <%
                Connection con = null;
                Statement st = null;
                ResultSet rs = null;

                try{

                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Driver Loaded");

                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db26","root","root");
                System.out.println("Connected");

                st = con.createStatement();

                String query = "SELECT * FROM emp";

                rs = st.executeQuery(query);

              
        %>
        <table border="1" width="500">
            <tr>
                <td><b>Employee Id:</b></td>
                <td><b>Employee Name:</b></td>
                <td><b>Employee Password:</b></td>
                <td><b>Employee Salary:</b></td>
                <td><b>Employee City:</b></td>
            </tr>
            
            <%
                while(rs.next())
                {
            %>
            <tr>
                <td><b><%=rs.getString(1)%></b></td>
                <td><b><%=rs.getString(2)%></b></td>
                <td><b><%=rs.getString(3)%></b></td>
                <td><b><%=rs.getString(4)%></b></td>
                <td><b><%=rs.getString(5)%></b></td>
            </tr>
            <%
                }
                  con.close();
                }
                catch(ClassNotFoundException e)
                {
                   System.out.println(e);
                }
                catch(SQLException e)
                {
                   System.out.println(e);
                }
            %> 
        </table>
        
    </body>
</html>
