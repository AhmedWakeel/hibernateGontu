package com.gontu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args)
	{
		
	
		
		Student student1 = new Student();
		student1.setStudent_name("mk12");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session openSession = sessionFactory.openSession();
		openSession.beginTransaction();
		
    	Student student = openSession.get(Student.class, 1);
		System.out.println(student.getStudent_name());

		student.setStudent_name("gk");
//		openSession.save(student);
		openSession.delete(student);
		
		openSession.getTransaction().commit();
		openSession.close();
		sessionFactory.close();
		
	}
}
