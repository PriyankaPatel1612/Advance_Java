
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class TestHttpServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Http Servlet Get Method</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY  bgcolor=cyan>");
        out.println("<FORM ACTION=TestHttpServlet METHOD=POST>");
        out.println("<INPUT TYPE=SUBMIT VALUE=SUBMIT/>");
        out.println("</FORM>");
        out.println("</BODY>");
        out.println("</HTML>");
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("passaword");
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Http Servlet</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY  bgcolor=cyan>");
        for(int i=0 ; i<10 ; i++)
        {
        out.println("<H1>Hey " + username + "!!</H1>");
        }

        out.println("</BODY>");
        out.println("</HTML>");
    }
    
    
}
