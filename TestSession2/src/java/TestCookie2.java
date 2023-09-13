
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TestCookie2 extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter out = response.getWriter();
        Cookie c1 = new Cookie("username",username);
        Cookie c2 = new Cookie("password",password);
        response.addCookie(c1);
        response.addCookie(c2);
        if(username!=null && password!=null && username.equalsIgnoreCase("Priyanka") && password.equals("12345"))
        {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Test Cookie2</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Test Cookie Page 2</h1>");
            out.println("<form action=TestCookie3 method=post>");
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
            response.sendRedirect("TestCookie1");
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.sendRedirect("TestCookie1");
    }
}
