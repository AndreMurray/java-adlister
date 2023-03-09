import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CouterServlet", value = "/CouterServlet")
public class CouterServlet extends HttpServlet {
    public static int count = 0;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String reset = request.getParameter("reset");
        if (reset == null ) {
            count = 0;
        }
        response.getWriter().println(count);
        count++;
    }

}
