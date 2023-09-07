package operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Common.HibernateConfig;
import entity.Employee;

public class Update
{

	public static void main(String[] args)
	{
		SessionFactory sf = HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Employee e = new Employee();
		e.setId(1);
		e.setFirstName("Diya");
		e.setLastName("Likhar");
		e.setDob("19-08-2001");
		e.setEmail("diya@gmail.com");
		e.setDepartment("Developer");
		e.setSalary("60000");
		
		session.update(e);
		System.out.println("Data Updated successfully");
		
		tr.commit();
		session.close();
		

	}

}
