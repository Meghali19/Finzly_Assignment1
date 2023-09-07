package criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import Common.HibernateConfig;
import entity.Employee;

public class NotTester 
{

	public static void main(String[] args) 
	{
		SessionFactory sf = HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.ne("department", "tester"));
		
		List<Employee> list = criteria.list();
		System.out.println("Employees having department other than tester are: ");
		for (Employee employee : list) {
			System.out.println(employee);
		}

	}

}
