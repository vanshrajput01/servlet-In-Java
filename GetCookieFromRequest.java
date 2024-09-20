// How to get Cookie form Request....

package com.example.demo;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet02")
public class Servlet02 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie []cookiesArray = req.getCookies();
		if(cookiesArray == null) {
			resp.setContentType("plain/text");
			resp.getWriter().print("Cookies is not found");
			
		}else {
			resp.setContentType("application/json");
			String cookieName = null; 
			String cookieValue = null;
			for(Cookie c :cookiesArray) {
				cookieName = c.getName();
				cookieValue = c.getValue();
			}
			String jsonString = "{\r\n"
					+ "    \"cookies_details\":{\r\n"
					+ "        \"cookie_name\": "+ cookieName + ",\r\n"
					+ "        \"cookie_value\": "+ cookieValue  +" \r\n"
					+ "    }\r\n"
					+ "}";
			resp.getWriter().print(jsonString);
		}
		

	}
	

}
