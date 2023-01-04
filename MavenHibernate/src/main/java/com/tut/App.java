package com.tut;

import java.util.Date;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Project statred");
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        System.out.println(factory);
        System.out.println(factory.isClosed());
        //for student class
        Student st= new Student();
        st.setCity("Hyd");
        st.setName("adarsh");
        st.getid(3);
        System.out.println(st);
       
        
       
        
        
        Session session= factory.openSession();
        Transaction tx = session.beginTransaction();
        
        session.save(st);
        
        //for address class
		/*
		 * Address ad= new Address(); ad.setAddressid(1); ad.setCity("indore");
		 * ad.setDate(new Date()); ad.setIsopen(true); ad.setStreet("stree1");
		 * session.save(ad);
		 */
       
        tx.commit();
        session.close();
        System.out.println("Done.....");
        }
}
