package criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

import Common.HibernateConfig;
import entity.Employee;

public class DepartmentCriteria 
{

	public static void main(String[] args)
	{
		SessionFactory sf = HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		
		Criteria criteria = session.createCriteria(Employee.class);
		
		Criterion c1 = Restrictions.like("department", "developer");
		Criterion c2 = Restrictions.like("department", "tester");
		
		LogicalExpression andExp = Restrictions.and(c1,c2);
		
		criteria.add(andExp);
		List<Employee> list = criteria.list();
		
		System.out.println("Employees in Developer and tester Department are: ");
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		
//		Criteria criteria1 = session.createCriteria(Employee.class);
//		criteria1.add(Restrictions.like("department", "tester"));
//		List<Employee> list1 = criteria1.list();
//		
//		System.out.println("Employees in Tester Department are: ");
//		for (Employee employee1 : list1) {
//			System.out.println(employee1);
//		}

	}

}
