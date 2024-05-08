package com.hibernate.states.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.tutorial.Hibernate.Certificate;
import com.hibernate.tutorial.Hibernate.Student;

public class StatesDemo {
	//Transient, Persistent, Detached, Removed
	
	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory();
		
		Student student = new Student();
		student.setId(112);
		student.setName("Prince");
		student.setCity("Bijwad");
		student.setCerti(new Certificate("Spring","2 months"));
		//student : transient state
		
		Session session = f.openSession();
		Transaction txn = session.beginTransaction();
		session.save(student);
		//student : persistent- session, database
		student.setName("Ayush");
		txn.commit();
		
		session.close();
		//student : detached state
		f.close();
	}
}
