package com.gontu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args)
	{
		
		Student_Address_Detail address_Detail = new Student_Address_Detail();
		address_Detail.setAddress_detail("mumbai , India");
		
		
		Student  student1 = new Student();
		Student  student2 = new Student();

		student1.setStudent_name("mk1");
		student2.setStudent_name("mk2");
		
		
		student1.setAddress_Detail(address_Detail);
		student2.setAddress_Detail(address_Detail);
		
		
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
