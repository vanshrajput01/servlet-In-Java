// Create Servlet Using Servlet Interface..
// Use can also add @ServletComponentScan in Your Project main Program(main.java)
package com.example.demo;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/servlet01")
public class Servlet01 implements Servlet{

	private ServletConfig servletConfig;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.print("Servlet initialized!!");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		return servletConfig;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("Text.html");
		res.getWriter().print("<h5>Give html here in Response!!</h5>");
		
		
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
