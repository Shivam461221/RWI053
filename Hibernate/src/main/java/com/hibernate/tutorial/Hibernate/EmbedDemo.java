package com.hibernate.tutorial.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbedDemo {

	public static void main(String[] args) {

		Configuration config = new Configuration();

		config.configure();

		SessionFactory factory = config.buildSessionFactory();

		Student student1 = new Student();
		student1.setId(101);
		student1.setName("Akku");
		student1.setCity("Kannod");

		Certificate c1 = new Certificate();
		c1.setCourse("Java");
		c1.setDuration("4 Months");
		student1.setCerti(c1);

		Student student2 = new Student();
		student2.setId(102);
		student2.setName("Chiku");
		student2.setCity("Kannod");

		Certificate c2 = new Certificate();
		c2.setCourse("React");
		c2.setDuration("2 Months");
		student2.setCerti(c2);

		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		session.save(student1);
		session.save(student2);
		
		txn.commit();
		//session.close();
		//factory.close();
	}
}
