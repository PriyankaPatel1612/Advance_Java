
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class TestHttpSession2 extends HttpServlet {

   public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
       PrintWriter out = response.getWriter();
       String username = request.getParameter("username");
       String password = request.getParameter("password");
       HttpSession session = request.getSession(true);
       session.setAttribute("username",username);
       session.setAttribute("password",password);
       System.out.println(session.getId());
       if(username!=null && password!=null && username.equalsIgnoreCase("Priyanka") && password.equals("12345"))
        {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Test HttpSession2</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Test Http Session Page 2</h1>");
            out.println("<form action=TestHttpSession3 method=post>");
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
            response.sendRedirect("TestHttpSession1");
        }
       
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
        response.sendRedirect("TestHttpSession1");
    }
}
