package Common;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Employee;

public class HibernateConfig 
{
	private HibernateConfig() {
	}

	public static SessionFactory getSessionFactory() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		return sf;
	}

}
