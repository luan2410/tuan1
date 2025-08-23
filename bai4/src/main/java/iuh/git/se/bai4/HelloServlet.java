package iuh.git.se.bai4;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
    private String welcomeMessage;

    @Override
    public void init() {
        // lấy init-param từ web.xml
        welcomeMessage = getServletConfig().getInitParameter("welcomeMessage");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // lấy context-param từ web.xml
        String companyName = getServletContext().getInitParameter("companyName");

        out.println("<h1>" + welcomeMessage + "</h1>");
        out.println("<p>Công ty: " + companyName + "</p>");
        out.println("<form method='post'>");
        out.println("<input type='text' name='name' placeholder='Nhập tên'>");
        out.println("<input type='submit' value='Gửi'>");
        out.println("</form>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<h1>Bạn vừa nhập: " + name + "</h1>");
        out.println("<a href='index.jsp'>Quay lại</a>");
    }

    @Override
    public void destroy() {
        // cleanup (nếu cần)
    }
}
