package com.example.demo;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/servlet01")
public class Servlet01 extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Service Method is Call!!");
		res.setContentType("Text.html");
		res.getWriter().print("<h5>Give html here in Response!!</h5>");
		
	}
	

}
