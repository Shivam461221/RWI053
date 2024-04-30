package com.hibernate.tutorial.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "project statrted..." );
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
       System.out.println(factory);
       Student student = new Student();
       student.setId(2);
       student.setName("Sachin");
       student.setCity("Banapura");
       System.out.println(student);
       
       Session session = factory.openSession();
       Transaction txn = session.beginTransaction();
       
       session.save(student);
       
       txn.commit();
       
       session.close();
    }
}
