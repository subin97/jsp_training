import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class HundredServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
                    throws ServletException, IOException{
        int total = 0;
        for (int cnt=1;cnt<201;cnt++){
            total+=cnt;
        }
        PrintWriter out= response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD><TITLE>Hundred Servlet</TITLE></HEAD>");
        out.println("<BODY>");
        out.printf("1+2+3+...+200=%d",total);
        out.println("</BODY>");
        out.println("</HTML>");
    }
}