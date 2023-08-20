package EmployeeInheritance;
import java.util.Scanner;
public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee name: ");
		String name = sc.next();
		
		System.out.println("Enter Employee Id: ");
		int id = sc.nextInt();
		
		System.out.println("Enter Employee Department: ");
		String department = sc.next();
		
		System.out.println("Enter Language Employee work on: ");
		String language = sc.next();
		
		Manager m1 = new Manager(101, "Abc", "HR");
		Manager m2 = new Manager();
		m1.display();
		m2.setName(name);
		m2.setId(id);
		m2.setDepartment(department);
		m2.display();
		
		Developer d1 = new Developer();
		Developer d2 = new Developer(102, "Xyz", "Java");
		
		d1.setId(id);
		d1.setName(name);
		d1.setLanguage(language);
		d1.display();
		d2.display();
		
		sc.close();

	}

}
