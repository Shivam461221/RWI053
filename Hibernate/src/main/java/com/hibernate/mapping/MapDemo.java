package com.hibernate.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		
		Question q1 = new Question();
		
		q1.setQuestionId(1);
		q1.setQuestion("what is java");
		
		Answer a1 = new Answer();
		a1.setAnswerId(101);
		a1.setAnswer("java is a programming language");
		a1.setQuestion(q1);
		q1.setAnswer(a1);
		
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		session.save(q1);
		session.save(a1);
		
		txn.commit();
		
		//fetching details
		Question que = (Question)session.get(Question.class, 1);
		System.out.println(que.getQuestion());
		System.out.println(que.getAnswer().getAnswer());
		
		//session.close();
		//factory.close();
	}
}
