package com.hibernate.mapping.m2m;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.setEid(101);
		e1.setName("Shivam");
			
		e2.setEid(102);
		e2.setName("Kuldeep");
		
		Project p1 = new Project();
		Project p2 = new Project();
		
		p1.setPid(11);
		p1.setProjectName("Library Management System");
		
		p2.setPid(17);
		p2.setProjectName("Office management System");
		
		List<Employee> list1 = new ArrayList<Employee>();
		List<Project> list2 = new ArrayList<Project>();
		
		list1.add(e1);
		list1.add(e2);
		
		list2.add(p1);
		list2.add(p2);
		
		e1.setProjects(list2);
		
		p1.setEmployees(list1);
		
		Session session =factory.openSession();
		Transaction txn = session.beginTransaction();
		
		session.save(e1);
		session.save(e2);
		
		session.save(p1);
		session.save(p2);
		
		txn.commit();
		
		//factory.close();
	}
}
