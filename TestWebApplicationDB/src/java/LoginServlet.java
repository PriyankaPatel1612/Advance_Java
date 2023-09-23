
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet {

  
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
        String uname = request.getParameter("username");
        String pwd = request.getParameter("password");
        HttpSession session = request.getSession(true);
        session.setAttribute("uname", uname);
        session.setAttribute("pwd", pwd);
        
        if(uname!=null && pwd!=null && uname.equalsIgnoreCase("Priyanka")&& pwd.equals("1111"))
        {
            response.sendRedirect("Home.jsp");
                   
        }
        else
        {
            response.sendRedirect("Login.html");
        }
    }

   
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("Login.html");
    }

    
}
