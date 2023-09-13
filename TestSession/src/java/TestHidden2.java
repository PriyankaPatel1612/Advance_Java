
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TestHidden2 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(username!=null && password!=null && username.equalsIgnoreCase("Priyanka") && password.equals("12345"))
        {
            PrintWriter out = response.getWriter();
          
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Test Hidden 1</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Test Session Page 2 Hidden TextField</h1>");
            out.println("<form action=TestHidden3 method=post>");
            out.println("<table>");
            out.println("<tr>");
            out.println("<td>First Name:</td>");
            out.println("<td><input type=text name=firstname placeholder=EnterFirstName /></td>");   
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Last Name: </td>");
            out.println("<td><input type=text name=lastname placeholder=EnterLastName /></td>");
            out.println("</tr>");
            out.println("<tr>");
            //using textfield to store username and password for next page
            //out.println("<td><input type=textfield name=username value="+username+" /></td>");
            //out.println("<td><input type=textfield name=password value="+password+" /></td>");
            out.println("<td><input type=hidden name=username value="+username+" /></td>");
            out.println("<td><input type=hidden name=password value="+password+" /></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td></td>");
            out.println("<td><input type=submit value=submit /><td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
        else
        {
            response.sendRedirect("TestHidden1");
        }
        
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.sendRedirect("TestHidden1");
    }


    
}
