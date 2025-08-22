package com.example.bai3;

import java.io.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/hello-servlet")
public class HelloServlet extends HttpServlet {
   @Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        User user = new User(  "nguyen van a", "vana@gmail.com",11);

        //
       ObjectMapper objectMapper  = new ObjectMapper();
       String jsonString = objectMapper.writeValueAsString(user);

       response.setContentType("application/json");

       PrintWriter out = response.getWriter();
       out.println(jsonString);
       out.flush();



    }

    public void destroy() {
    }
}