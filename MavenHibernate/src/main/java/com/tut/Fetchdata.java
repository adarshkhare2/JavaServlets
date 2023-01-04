package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetchdata {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session= factory.openSession();
        
        //Get method:Id=2 to Fetch data
        Student student= (Student)session.get(Student.class, 2);
        System.out.println(student);
        
        //Load method:Id=2 to Fetch data
        Student student1= (Student)session.load(Student.class, 2);
        System.out.println(student1);
        
        
        session.close();
        factory.close();
        
        
        
	}
}
