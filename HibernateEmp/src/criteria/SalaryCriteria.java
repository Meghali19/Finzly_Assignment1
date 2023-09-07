package criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import Common.HibernateConfig;
import entity.Employee;

public class SalaryCriteria 
{

	public static void main(String[] args)
	{
		SessionFactory sf = HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.gt("salary", "30000"));
		
		List<Employee> list = criteria.list();
		System.out.println("Employee having salary more than 30K: ");
		for (Employee employee : list) {
			System.out.println(employee);
		}

	}

}
