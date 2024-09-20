// How to get Session Object using HttpSession and set information in Session.. 

package com.example.demo;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/servlet01")
public class Servlet01 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		session.setAttribute("userName", "User01");
		session.setMaxInactiveInterval(60);
		resp.setContentType("plain/text");
		resp.getWriter().print("User information set in Seesion Object!!");

	}



	

}
	

