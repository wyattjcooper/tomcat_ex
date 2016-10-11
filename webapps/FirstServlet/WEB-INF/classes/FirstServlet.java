import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hi malea!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hi malea!</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}