package staticAndInstance;

public class Student 
{
	private int studentId;
	private String name;
	private static int totalStudents = 0;
	
	public int getStudentId() 
	{
		return studentId;
	}
	public void setStudentId(int studentId)
	{
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
	
	public static int getTotalStudents() 
	{
		return totalStudents;
	}
	public static void setTotalStudents(int totalStudents)
	{
		Student.totalStudents = totalStudents;
	}
	
	public Student(int studentId, String name)
	{
		this.studentId = studentId;
		this.name = name;
	}
	
	public void enrollStudent(Student s1)
	{
		Student.getTotalStudents();
		totalStudents += 1;
		Student.setTotalStudents(totalStudents);
	}
	
	public void dropStudent(Student s1)
	{
		Student.getTotalStudents();
		totalStudents -= 1;
		System.out.println("Student "+s1.getName()+" has been dropped!!");
		Student.setTotalStudents(totalStudents);
		
		s1 = null;
	}
	
	
	

}
