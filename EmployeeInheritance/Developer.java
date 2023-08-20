package EmployeeInheritance;

public class Developer extends Employee
{

	private String language;
	
	public Developer()
	{
		super();
	}

	public Developer(int id, String name, String language)
	{
		super(id, name);
		this.setLanguage(language);
	}

	public String getLanguage()
	{
		return language;
	}

	public void setLanguage(String language) 
	{
		this.language = language;
	}	

	public void display()
	{
		System.out.println("Employee Id: "+ getId());
		System.out.println("Employee Name: "+getName());
		System.out.println("Programming Language they work on: "+getLanguage());
		
		System.out.println("------------------------------------");
	}
}
