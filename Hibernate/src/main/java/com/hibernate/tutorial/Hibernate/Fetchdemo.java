package com.hibernate.tutorial.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetchdemo {
	public static void main(String[] args) {
		//get, load
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		//get-student details
		Student student = (Student)session.load(Student.class, 2);
		System.out.println(student);
		
		Address address = (Address)session.get(Address.class, 1);
		System.out.println(address.getCity());
		
		
//		session.close();
//		factory.close();
	}
}
