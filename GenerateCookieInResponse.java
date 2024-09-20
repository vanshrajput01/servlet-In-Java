// How to set Cookies in Response..
package com.example.demo;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/servlet01")
public class Servlet01 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie = new Cookie("userId", "10010");
		cookie.setMaxAge(10);
		resp.addCookie(cookie);
		resp.setContentType("Text/html");
		resp.getWriter().print("<p>Cookie set Success</p>");

	}
	

}
	

