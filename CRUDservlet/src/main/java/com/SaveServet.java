package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SaveServet")
public class SaveServet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String country=request.getParameter("country");
		
		Stud s= new Stud();
		s.setName(name);
		s.setPassword(password);
		s.setEmail(email);
		s.setCountry(country);
		
		int status= StudDao.save(s);

		if(status>0)
		{
			out.print("<h1>Data got Saved</h1>");
			request.getRequestDispatcher("index.html").include(request, response);
		}else
		{
			out.print("<h1> Please Try again to save </h1>");
		}
		
		out.close();
	}

}
