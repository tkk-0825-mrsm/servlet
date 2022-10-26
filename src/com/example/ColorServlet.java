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
        System.out.println("リクエストURL=" + request.getRequestURL());
        System.out.println("リクエストURI=" + request.getRequestURI());
        System.out.println("Servletパス=" + request.getServletPath());    
        String pathInfo = request.getPathInfo();
        System.out.println("拡張パス=" + pathInfo);
        switch (pathInfo) {
            case "/red": 
                request.setAttribute("color", "赤");
                this.getServletContext().getRequestDispatcher("/red.jsp").forward(request, response);
            break;
            case "/blue": 
                request.setAttribute("color", "青");
                this.getServletContext().getRequestDispatcher("/blue.jsp").forward(request, response);
            break;
        }
    }

}