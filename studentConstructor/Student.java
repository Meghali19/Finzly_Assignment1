package studentConstructor;

public class Student
{
	private String name;
	private int age;
	private int studentId;
	
	
	
	public Student() 
	{
		this.name = "Unknown";
		this.age = 0;
		this.studentId = 000;
	}

	public Student(int age)
	{
		this.age = age;
	}

	public Student(String name, int age, int studentId) 
	{
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public int getStudentId() 
	{
		return studentId;
	}

	public void setStudentId(int studentId) 
	{
		this.studentId = studentId;
	}
	
	public void display()
	{
		System.out.println("Student Id: "+getStudentId());
		System.out.println("Student Name: "+getName());
		System.out.println("Student age: "+getAge());
		
		System.out.println("------------------------------------");
	}

}
