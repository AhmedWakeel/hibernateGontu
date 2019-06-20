package com.gontu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args)
	{
		
		StudentCertification certification1 = new StudentCertification();
		certification1.setCertification_Name("java");
		
		StudentCertification certification2 = new StudentCertification();
		certification2.setCertification_Name("python");
		
		Student student1 = new Student();
		student1.setStudent_name("mk1");
		(student1.getCertifications()).add(certification1);
		
		Student student2 = new Student();
		student2.setStudent_name("sk1");
		(student2.getCertifications()).add(certification2);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session openSession = sessionFactory.openSession();
		openSession.beginTransaction();
		
		openSession.save(student1);
		openSession.save(student2);
		
		openSession.getTransaction().commit();
		openSession.close();
		sessionFactory.close();
		
	}
}
