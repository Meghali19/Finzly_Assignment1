package operation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Common.HibernateConfig;
import entity.Employee;

public class Read
{

	public static void main(String[] args) 
	{
		SessionFactory sf = HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		
		//Reading data with ID
		Employee e1 = session.load(Employee.class, 1);
		System.out.println(e1);

		//Reading full list
		Criteria criteria = session.createCriteria(Employee.class);
		
		List<Employee> list = criteria.list();
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}

}
