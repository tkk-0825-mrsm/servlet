package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sendJapanese")
public class SendJapanese extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("Shift-JIS");
        response.setContentType("text/html;charset=Shift-JIS");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html></html>");
        out.println("<head><meta charset='Shift-JIS' /></head>");
        out.println("<title>sendJapanese</title>");
        out.println("</head>");
        out.println("<body>");
        out.print("<p>");
        out.print(request.getParameter("lastName"));
        out.print("");
        out.print(request.getParameter("firstName"));
        out.print("さん、こんにちは。");
        out.print("</p>");
        out.println("</body>");
        out.println("</html>");
    }

}

