
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TestHidden3 extends HttpServlet {

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Test Hidden 1</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Test Session Page 3 Hidden TextField</h1>");
        out.println("<h3>username: "+username+"</h3>");
        out.println("<h3>Password: "+password+"</h3>");
        out.println("<h3>FirstName: "+firstname+"</h3>");
        out.println("<h3>LastName: "+lastname+"</h3>");
        out.println("</body>");
        out.println("</html>");
        
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("TestHidden1");
    }

  
}
