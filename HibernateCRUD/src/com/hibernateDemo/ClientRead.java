package com.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientRead 
{

	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
		Employee emp = session.load(Employee.class, 2);
		System.out.println(emp);

		tr.commit();
		session.close();
	}

}
