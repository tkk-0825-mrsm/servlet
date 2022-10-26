package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet ("/color/*")
public class ColorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("���N�G�X�gURL=" + request.getRequestURL());
        System.out.println("���N�G�X�gURI=" + request.getRequestURI());
        System.out.println("Servlet�p�X=" + request.getServletPath());    
        String pathInfo = request.getPathInfo();
        System.out.println("�g���p�X=" + pathInfo);
        switch (pathInfo) {
            case "/red": 
                request.setAttribute("color", "��");
                this.getServletContext().getRequestDispatcher("/red.jsp").forward(request, response);
            break;
            case "/blue": 
                request.setAttribute("color", "��");
                this.getServletContext().getRequestDispatcher("/blue.jsp").forward(request, response);
            break;
        }
    }

}