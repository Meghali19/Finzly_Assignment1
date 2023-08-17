package staticAndInstance;

public class Main 
{

	public static void main(String[] args)
	{
		Student s1 = new Student(1,"Ram");
		s1.enrollStudent(s1);
		
		System.out.println("Total Students: "+ Student.getTotalStudents());		
		Student s2 = new Student(2,"Shyam");
		s2.enrollStudent(s2);
		System.out.println("Total Students: "+ Student.getTotalStudents());
		
		s1.dropStudent(s1);
		System.out.println("Total Students: "+ Student.getTotalStudents());

	}

}
