
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class TestGenericServlet2 extends GenericServlet {

    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
       //        System.out.println("Service Method"); 
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Generic Servlet</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY  bgcolor=cyan>");
        for(int i=0 ; i<5 ; i++)
        {
         out.println("<H1>Hello From Generic Servlet</H1>");   
        }
        out.println("</BODY>");
        out.println("</HTML>");
    }
    }

 
