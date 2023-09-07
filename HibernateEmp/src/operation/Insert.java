package operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Common.HibernateConfig;
import entity.Employee;

public class Insert
{

	public static void main(String[] args)
	{
		SessionFactory sf = HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		//System.out.println("Hello");
		
		Employee e = new Employee();
		e.setId(1);
		e.setFirstName("Meghali");
		e.setLastName("Likhar");
		e.setDob("19-08-2001");
		e.setEmail("meghali@gmail.com");
		e.setDepartment("Developer");
		e.setSalary("20000");
		
		session.save(e);
		tr.commit();
		System.out.println("Data Inserted successfully");
		session.close();

		

	}

}
