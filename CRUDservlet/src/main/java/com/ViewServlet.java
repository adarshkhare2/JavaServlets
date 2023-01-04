package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		  response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	        out.println("<a href='index.html'>Add New Student</a>");  
	        out.println("<h1>Student List</h1>");  
	          
	        List<Stud> list=StudDao.allStudentlist();
	        System.out.println(list.get(0));

	        out.print("<table border='1' width='100%'");  
	        out.print("<tr><th>Id</th><th>Name</th><th>Password</th><th>Email</th><th>Country</th>  <th>Edit</th><th>Delete</th></tr>");  
	        for(Stud s:list){  
	        out.print("<tr>\r\n"
	        			+ "    <td>\"+s.getId()+\"</td>\r\n"
	        			+ "    <td>\"+s.getName()+\"</td>\r\n"
	        			+ "    <td>\"+s.getPassword()+\"</td>\r\n"
	        			+ "    <td>\"+s.getEmail()+\"</td>\r\n"
	        			+ "    <td>\"+s.getCountry()+\"</td>\r\n"
	        			+ "    <td><a href='EditServlet?id=\"+s.getId()+\"'>edit</a></td>\r\n"
	        			+ "    <td><a href='DeleteServlet?id=\"+s.getId()+\"'>delete</a></td>\r\n"
	        			+ "</tr>");
	        				}  
	        out.print("</table>");  
	          
	        out.close();  
	    }  
	
	}


