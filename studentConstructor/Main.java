package studentConstructor;
import java.util.Scanner;
public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Name: ");
		String name = sc.next();
		
		System.out.println("Enter Student age: ");
		int age = sc.nextInt();
		
		Student s1 = new Student();
		Student s2 = new Student(15);
		Student s3 = new Student("Ram", 16, 102);
		
		s1.setAge(age);
		s1.setName(name);
		
		s1.display();
		s2.display();
		s3.display();
		

	}

}
