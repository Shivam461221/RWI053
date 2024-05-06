package com.hibernate.mapping.o2mm2o;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args){
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		
//		Question q1 = new Question();	
//		q1.setQuestionId(1);
//		q1.setQuestion("what is java");
//		
//		Answer a1 = new Answer();
//		a1.setAnswerId(101);
//		a1.setAnswer("java is a programming language");
//		a1.setQuestion(q1);
//		
//		Answer a2 = new Answer();
//		a2.setAnswerId(103);
//		a2.setAnswer("java is a object oriented programming language");
//		a2.setQuestion(q1);
//		
//		Answer a3 = new Answer();
//		a3.setAnswerId(105);
//		a3.setAnswer("java is a secure and robust programming language");
//		a3.setQuestion(q1);
//		
//		List<Answer> list = new ArrayList<Answer>();
//		list.add(a1);
//		list.add(a2);
//		list.add(a3);
//		
//		q1.setAnswers(list);
		
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
//		session.save(q1);
//		session.save(a1);
//		session.save(a2);
//		session.save(a3);
		
		Question que = (Question)session.get(Question.class, 1);
		System.out.println(que.getQuestionId());
		System.out.println(que.getQuestion());
		//lazy
		//System.out.println(que.getAnswers().size());
		
//		//fetching details
//		Question que = (Question)session.get(Question.class, 1);
//		System.out.println(que.getQuestion());
//		
//		for (Answer answer : que.getAnswers()) {
//			System.out.println(answer.getAnswer());
//		}
		
		
		txn.commit();
		//session.close();
		//factory.close();
	}
}
