
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TestHidden1 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Test Hidden 1</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Test Session Page 1 Hidden TextField</h1>");
        out.println("<form action=TestHidden2 method=post>");
        out.println("<table>");
        out.println("<tr>");
        out.println("<td>Username:</td>");
        out.println("<td><input type=text name=username placeholder=enterusername /></td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Password: </td>");
        out.println("<td><input type=password name=password placeholder=enterpassword /></td>");
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

  
   
}
