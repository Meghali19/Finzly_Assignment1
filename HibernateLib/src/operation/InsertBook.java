package operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Entity.Book;
import common.HibernateConfig;

public class InsertBook
{
	public static void main(String[] args) 
	{
		SessionFactory sf = HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Book book = new Book("HJK","mithul",2008,"MIT123");
		session.save(book);
		tr.commit();
		session.close();
		
	}

}
