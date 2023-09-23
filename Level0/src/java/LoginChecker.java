
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class LoginChecker extends HttpServlet {
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname = request.getParameter("username");
        String pwd = request.getParameter("password");
        HttpSession session = request.getSession(true);
        session.setAttribute("username", uname);
        session.setAttribute("password", pwd);
        if(uname!=null && pwd!=null && uname.equalsIgnoreCase("Priya") && pwd.equals("12345"))
        {
            response.sendRedirect("home.jsp");
        }else{
            response.sendRedirect("Login.html");
        }
        
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("Login.html");
    }
   
}
