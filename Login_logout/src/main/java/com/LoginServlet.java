package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		request.getRequestDispatcher("link.html").include(request,response);
		
		String name= request.getParameter("name");
		String password=request.getParameter("password");
		
		
		
		
		
		if(password.equals("admin"))
		{ 
		out.println("<h1>Welcome to login page</h2> ");
		out.println("Welcome"+ name);
		
		Cookie ck = new Cookie("name", name);
		response.addCookie(ck);
		}else
		{
			out.println("Login id or password wrong");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		out.close();

	}

}
