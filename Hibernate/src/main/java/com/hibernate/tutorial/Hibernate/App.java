package com.hibernate.tutorial.Hibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

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
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "project statrted..." );
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
       System.out.println(factory);
       
       //student object
       Student student = new Student();
       student.setId(2);
       student.setName("Sachin");
       student.setCity("Banapura");
       System.out.println(student);
       
       //address object
       Address ad = new Address();
       ad.setStreet("SadhuVaswani");
       ad.setCity("Indore");
       ad.setOpen(true);
       ad.setAddedDate(new Date());
       ad.setX(12.5);
       
       //reading image
       FileInputStream fis = new FileInputStream("src/main/java/photo.jpg");
       byte[] data = new byte[fis.available()];
       fis.read(data);
       ad.setImage(data);
       
       
       Session session = factory.openSession();
       Transaction txn = session.beginTransaction();
       
       session.save(student);
       session.save(ad);
       
       txn.commit();
       
       session.close();
       factory.close();
       System.out.println("Done");
    }
}
