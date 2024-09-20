// How to get Session Attribute(infromation form session) using HttpSession.....

package com.example.demo;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/servlet02")
public class Servlet02 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie []cookiesArray = req.getCookies();
		if(cookiesArray == null) {
			resp.setContentType("plain/text");
			resp.getWriter().print("In Session infromation is not found");
			
		}else {
			resp.setContentType("application/json");
			HttpSession session = req.getSession();
			Object sessionvalue = session.getAttribute("userName");

			String jsonString = "{\r\n"
					+ "    \"cookies_details\":{\r\n"
					+ "        \"userName\": "+ sessionvalue + "\r\n"
					+ "    }\r\n"
					+ "}";
			resp.getWriter().print(jsonString);
		}
		

	}
	

}
