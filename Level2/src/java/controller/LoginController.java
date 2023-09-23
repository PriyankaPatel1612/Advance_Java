
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.LoginAuthenticator;

public class LoginController extends HttpServlet {

   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("login.html");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname = request.getParameter("username");
        String pwd = request.getParameter("password");
        System.out.println(uname);
        System.out.println(pwd);
        
        LoginAuthenticator obj = new LoginAuthenticator();
        if(obj.isLogin(uname,pwd))
        {
            HttpSession session = request.getSession(true);
            session.setAttribute("username", uname);
            session.setAttribute("password", pwd);
            response.sendRedirect("home.jsp");
        }else{
            response.sendRedirect("login.html");
        }
    }
}
