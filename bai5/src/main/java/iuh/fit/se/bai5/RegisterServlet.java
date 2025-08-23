package iuh.fit.se.bai5;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String fullname = request.getParameter("fullname");
        String email = request.getParameter("email");
        String password = request.getParameter("password"); // sẽ không hiển thị
        String gender = request.getParameter("gender");
        String[] hobbies = request.getParameterValues("hobby");
        String about = request.getParameter("about");

        PrintWriter out = response.getWriter();
        out.println("<h2>Thông tin đăng ký:</h2>");
        out.println("<p>Họ tên: " + fullname + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("<p>Giới tính: " + gender + "</p>");

        if (hobbies != null) {
            out.println("<p>Sở thích: ");
            for (String h : hobbies) {
                out.print(h + " ");
            }
            out.println("</p>");
        }

        out.println("<p>Giới thiệu: " + about + "</p>");
        out.println("<a href='register.jsp'>Quay lại Form</a>");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Chuyển GET về POST để xử lý chung
        doPost(request, response);
    }
}