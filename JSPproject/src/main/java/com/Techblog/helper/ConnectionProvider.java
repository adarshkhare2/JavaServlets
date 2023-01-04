package com.Techblog.helper;
import java.sql.*;

public class ConnectionProvider {
	private static Connection con;
	public static Connection getConnection()//Connection is return type
	{
		try {
			if(con==null)
			{
				Class.forName("com.mysql.jdbc.Driver");
				con= DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog","root","adarsh");

			}					
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	return con;	
	}

}
