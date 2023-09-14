
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class TestHttpSession3 extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
       HttpSession session = request.getSession(true);
       String username = (String)session.getAttribute("username");
       String password = (String)session.getAttribute("password");
       String firstname = request.getParameter("firstname");
       String lastname = request.getParameter("lastname");
       session.setAttribute("firstname",firstname);
       session.setAttribute("lastname",lastname);
       
       PrintWriter out = response.getWriter();
       out.println("<html>");
            out.println("<head>");
            out.println("<title>Test HttpSession3</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Test Http Session Page 3</h1>");
      
            out.println("<table>");
            out.println("<tr>");
            out.println("<td>Username:</td>");
            out.println("<td>"+username+"</td>");   
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Password: </td>");
            out.println("<td>"+password+"</td>");
            out.println("</tr>");
            out.println("<td>First Name: </td>");
            out.println("<td>"+firstname+"</td>");
            out.println("</tr>");
            out.println("<td>Last Name: </td>");
            out.println("<td>"+lastname+"</td>");
            out.println("</tr>");
            out.println("</body>");
            out.println("</html>");
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
        response.sendRedirect("TestHttpSession1");
    }
}
