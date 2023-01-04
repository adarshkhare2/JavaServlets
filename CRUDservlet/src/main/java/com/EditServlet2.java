package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EditServlet2")
public class EditServlet2 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		String sid = request.getParameter("id");
        int id=Integer.parseInt(sid);  // convert String to Integer //type casting
        
        
        String name=request.getParameter("name");
        String password=request.getParameter("password");
        String email= request.getParameter("email");
        String country=request.getParameter("country");
        
        Stud s= new Stud();
        
        s.setCountry(country);
        s.setEmail(email);
        s.getName();
        s.getPassword();
        
        int status= StudDao.update(s);
        
        if(status>0)
        {
        	out.print("Got update");
        	response.sendRedirect("ViewServlet");
        }
        else 
        {
        	out.print("<h1>Unable to Process</h1>");
        	
        }
        
       out.close();
	}

}
