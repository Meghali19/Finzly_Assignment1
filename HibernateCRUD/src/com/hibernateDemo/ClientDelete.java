package com.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDelete
{

	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setId(2);
		emp.setName("Roshy");
		emp.setSalary("1000000");
		session.delete(emp);
		System.out.println("Data deleted successfully");
		
		tr.commit();
        session.close();
	}

}
