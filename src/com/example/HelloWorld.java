package com.example;

import java.io.IOException; 
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/helloWorld")
public class HelloWorld extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	     throws ServletException, IOException {
	     response.setContentType("text/html;charset=UTF-8");
	     PrintWriter out = response.getWriter();
	     out.println("<!DOCTYPE html></html>");
	     out.println("<head><meta charset='UTF-8' /></head>");
	     out.println("<title>Hello World!</title>");
	     out.println("</head>");
	     out.println("<body>Hello World!</body>");
	     out.println("</html>");
	   }
	
	 }

