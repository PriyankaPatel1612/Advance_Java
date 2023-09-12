
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TestLogin extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("Login.html");
        
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
        if(username!=null && password!=null && password.equals("12345")&& username.equalsIgnoreCase("Priya"))
        {
//            out.println("<H1>Login Successfully!</H1>");
            response.sendRedirect("Home.jsp");
        }
        else{
//            out.println("<H1>Login Failed</H1>");
            response.sendRedirect("Login.html");
        }
        out.println("</BODY>");
        out.println("</HTML>");
    }
}
