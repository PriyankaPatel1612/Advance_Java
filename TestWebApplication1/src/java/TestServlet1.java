
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class TestServlet1 implements Servlet {

  
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Init Method");
    }

    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
//        System.out.println("Service Method"); 
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Test Servlet</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY  bgcolor=cyan>");
        for(int i=0 ; i<5 ; i++)
        {
         out.println("<H1>Hello From Test Servlet</H1>");   
        }
        out.println("</BODY>");
        out.println("</HTML>");
    }

    public void destroy() {
        System.out.println("Destroy Method");
    }
    
    public ServletConfig getServletConfig() {
      return null;
    }

    
    @Override
    public String getServletInfo() {
        return null;
    
    }

    

    
}
