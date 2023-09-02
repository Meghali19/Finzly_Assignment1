package employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Operation 
{
	static Scanner sc = new Scanner(System.in);
	
	static ArrayList<Employee> list = new ArrayList<>();
    static int count =0;
	static void add()
	{
		String name;
		if(count==0)
		{
			System.out.println("Enter Your Name: ");
			name = sc.nextLine();
			count++;
		}
		else
		{
			System.out.println("Enter Your Name: ");
			sc.nextLine();
			name = sc.nextLine();	
		}
		
		System.out.println("Enter Employee age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter Employee position: ");
		sc.nextLine();
		String position = sc.nextLine();
		
		System.out.println("Enter Employee Salary: ");
		double salary = sc.nextDouble();
		
		
		Employee e1 = new Employee(name, age, position, salary);
		
		list.add(e1);
		System.out.println("Employee is added!!");
	    	
	}
	
	static Employee viewEmployee(int id)
	{
		for (Employee employee : list) 
		{
			if(employee.getEmpId() == id)
			{
				return employee;
			}
			else
			{
				System.out.println("Employee is not present");
				return null;
			}
			
		}
		return null;
	}
	
	static void viewEmployeeList()
	{
		for (Employee employee : list) 
		{
			System.out.println(employee);
		}
	}
	

}
