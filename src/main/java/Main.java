import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.nio.charset.Charset;

public class Main extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    String output = "";

    for (int i = 0; i < 1000; i++) {
      output += "X";
    }

    resp.addHeader("Connection", "keep-alive");
    resp.addHeader("Content-Type", "text/plain");
    resp.setContentLength(output.getBytes().length);
    resp.getWriter().print(output);
  }
}
