
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TestCookie3 extends HttpServlet {


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookies[] = request.getCookies();
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        Cookie c1 = new Cookie("firstname",firstname);
        Cookie c2 = new Cookie("lastname",lastname);
        response.addCookie(c1);
        response.addCookie(c2);
        
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Test Cookie 3</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Test Cookie Page3</h1>");
        out.println("<body>");
       
        for(int i=0 ; i<cookies.length ; i++)
        {
            out.println("<br />");
            out.println(cookies[i].getName() + " = " + cookies[i].getValue());
        }
        out.println("<form action=TestCookie4 method=post>");
        out.println("<td><input type=submit value=submit /><td>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("TestCookie1");
    }
}
