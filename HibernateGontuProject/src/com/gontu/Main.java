package com.gontu;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args)
	{
		
		Student  student = new Student();
		student.setDate(new Date());
		student.setName("mk44");
		
		Student_Detail detail = new Student_Detail();
		detail.setStudent_mobile_number("990998");
		detail.setStudent(student);
		
		student.setDetail(detail);
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session openSession = sessionFactory.openSession();
		openSession.beginTransaction();
		
		openSession.save(student);
		
		openSession.getTransaction().commit();
		openSession.close();
		sessionFactory.close();
		
	}
}
