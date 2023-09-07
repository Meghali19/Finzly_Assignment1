package criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;

import Common.HibernateConfig;
import entity.Employee;

public class SortCriteria 
{

	public static void main(String[] args) 
	{
		SessionFactory sf = HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.addOrder(Order.desc("salary"));
		
		List<Employee> list = criteria.list();
		System.out.println("Employees according to salary: ");
		for (Employee employee : list) {
			System.out.println(employee);
		}

	}

}
