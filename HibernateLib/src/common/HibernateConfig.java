package common;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Entity.Book;

public class HibernateConfig
{
	private HibernateConfig() {
	}

	public static SessionFactory getSessionFactory() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Book.class);
		SessionFactory sf = cfg.buildSessionFactory();
		return sf;
	}

}
