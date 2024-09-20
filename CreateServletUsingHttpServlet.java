// Create servlet using HttpServlet and generate Json Response 
package com.example.demo;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/servlet01")
public class Servlet01 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("application/json");
		String jsonString  = "{\r\n"
				+ "    \"program_details\":{\r\n"
				+ "        \"program_id\":101,\r\n"
				+ "        \"program_name\":\"program_name01\"\r\n"
				+ "    }\r\n"
				+ "}";
		resp.getWriter().print(jsonString);

	}
	

}
	

