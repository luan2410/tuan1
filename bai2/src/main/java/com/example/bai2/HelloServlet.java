package com.example.bai2;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
        response.setContentType("text/xmlt");
        PrintWriter out = response.getWriter();
        out.println("loc truong luan    ");
        out.println("<h1>Chào mừng bạn đến với Jakarta Servlet! 👋</h1>");
        out.println("<p>Đây là một ví dụ đơn giản về phương thức doGet() trả về HTML.</p>");


    }


    public void destroy() {
    }
}