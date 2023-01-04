package com;

import java.util.*;
import java.sql.*;

public class StudDao {
	public static Connection getConnection() {

		String url = "jdbc:mysql://localhost:3306/servlets";
		String name = "root";
		String pass = "adarsh";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, name, pass);
			return con;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
//SAVE

	public static int save(Stud s) {
		int status = 0;// if data got insert in operation
		try {
			Connection con = StudDao.getConnection();
			PreparedStatement ps = con
					.prepareStatement("insert into student(password,name,email,country)values(?,?,?,?)");
			ps.setString(1, s.getPassword());
			ps.setString(2, s.getName());
			ps.setString(3, s.getEmail());
			ps.setString(4, s.getCountry());

			status = ps.executeUpdate();

			con.close();

		} catch (Exception e1) {
			System.out.println(e1);
		}
		return status;
	}
// UPDATE

	public static int update(Stud s) {
		int status = 0;
		try {
			Connection con = StudDao.getConnection();
			PreparedStatement ps = con
					.prepareStatement("update student set name=?,password=?,email=?,country=? where id=?");

			ps.setString(1, s.getName());
			ps.setString(2, s.getPassword());
			ps.setString(3, s.getEmail());
			ps.setString(4, s.getCountry());
            ps.setInt(5,s.getId());  

			status = ps.executeUpdate();
			con.close();

		} catch (Exception e2) {
			System.out.println(e2);
		}

		return status;
	}
//DELETE

	public static int delete(int id) {
		int status = 0;
		try {
			Connection con = StudDao.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from student where id=?");
			ps.setInt(1, id);
			status = ps.executeUpdate();
			con.close();

		} catch (Exception e3) {
			System.out.println(e3);
		}
		return status;
	}
//READ/SEARCH

	public static Stud searchStudid(int id) {
		Stud s = new Stud();

		try {
			Connection con = StudDao.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from student where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
                s.setId(rs.getInt(1));  
				s.setName(rs.getString(2));
				s.setPassword(rs.getString(3));
				s.setEmail(rs.getString(4));
				s.setCountry(rs.getString(5));
			}
			con.close();
		} catch (Exception e4) {
			System.out.println(e4);
		}
		return s;
	}

	// SHOW STUDENTS

	

	public static List<Stud> allStudentlist(){  
        List<Stud> list=new ArrayList<Stud>();  
          
        try{  
            Connection con=StudDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from student");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
            	
                Stud s = new Stud();
                s.setId(rs.getInt(1));  
                s.setName(rs.getString(2));  
                s.setPassword(rs.getString(3));  
                s.setEmail(rs.getString(4));  
                s.setCountry(rs.getString(5));  
                list.add(s);  
            }  
            System.out.println(list);
            con.close();  
        }catch(Exception e){
        	e.printStackTrace();
        	}  
          
        return list;  
    }  

}
