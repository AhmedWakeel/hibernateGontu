package com.gontu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args)
	{
		
		Student  student = new Student();
		
	
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session openSession = sessionFactory.openSession();
		openSession.beginTransaction();
		
		openSession.save(student);
		
		openSession.getTransaction().commit();
		openSession.close();
		sessionFactory.close();
		
	}
}
