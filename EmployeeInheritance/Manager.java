package EmployeeInheritance;

public class Manager extends Employee
{
	private String department;
	
	public Manager()
	{
	    super();
	}
	
	public Manager(int id, String name, String department) 
	{
		super(id, name);
		this.department = department;
		
	}

	public String getDepartment()
	{
		return department;
	}

	public void setDepartment(String department)
	{
		this.department = department;
	}
	
	public void display()
	{
		System.out.println("Employee Id: "+ getId());
		System.out.println("Employee Name: "+getName());
		System.out.println("Department they work in: "+getDepartment());
		
		System.out.println("------------------------------------");
	}
	

}
