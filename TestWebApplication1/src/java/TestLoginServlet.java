
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TestLoginServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Test Login Servlet</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY  bgcolor=cyan>");
        out.println("<FORM ACTION=TestLoginServlet METHOD=POST>");
        out.println("<H1>Username: <INPUT TYPE=text NAME=username PLACEHOLDER=ENTER USERNAME /><BR /></H1>");
        out.println("<H1>Password: <INPUT TYPE=password NAME=password PLACEHOLDER=ENTER PASSWORD /><BR /></H1>");
        out.println("<INPUT TYPE=SUBMIT VALUE=SUBMIT />");
        out.println("</FORM>");
        out.println("</BODY>");
        out.println("</HTML>");
    } 


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Http Servlet</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY  bgcolor=cyan>");
//        out.println("<h3>username: "+username+" </h3>");
//        out.println("<h3>password: "+password+" </h3>");
        if(username!=null && password!=null && password.equals("12345")&& username.equalsIgnoreCase("Priya"))
        {
            out.println("<H1>Login Successfully!</H1>");
        }
        else{
            out.println("<H1>Login Failed</H1>");
        }
        out.println("</BODY>");
        out.println("</HTML>");
    }
    
}
