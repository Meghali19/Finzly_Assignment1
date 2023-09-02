package school;

import java.util.ArrayList;

import java.util.Scanner;

public class Operation
{
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Student> listS = new ArrayList<>();
	static ArrayList<Teacher> listT = new ArrayList<>();
	//HashMap<String, ArrayList<Student>,ArrayList<Teacher>> list = new HashMap<>();
	static int count =0 ;
	
	public static void add()
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
		
		System.out.println("Enter your Occupation: ");
		String occ = sc.nextLine();
		
		System.out.println("Enter your age: ");
        int age = sc.nextInt();
        
        int class1 =0;
        double salary=0.0;
        if(occ.equalsIgnoreCase("student"))
        {
        	System.out.println("Enter in which class you study: ");
        	class1 = sc.nextInt();
        	
        	
        	Student s = new Student();
            s.setName(name);
            s.setAge(age);
            s.setOccupation(occ);
            s.setClass1(class1);
            
            listS.add(s);
            System.out.println("Student is added!!");
        }
        else
        {
        	System.out.println("Enter your Salary: ");
        	salary = sc.nextDouble();
        	
        	Teacher t = new Teacher();
            t.setName(name);
            t.setAge(age);
            t.setOccupation(occ);
            t.setSalary(salary);
            
            listT.add(t);
            System.out.println("Teacher is added!!");
        }
        
        
        
	}
	
	public static void display()
	{
		for (Student student : listS)
		{
			System.out.println(student);
		}
		for (Teacher teacher : listT)
		{
			System.out.println(teacher);
		}
		
	}
	
	public static void exit()
	{
		System.out.print("Do you really want to exit (y/n): ");
        String value = sc.next();
        if (value.equalsIgnoreCase("Y")) {
            System.out.println("Bye - have a good day");
            System.exit(0);
        }
        else if (value.equalsIgnoreCase("n"))
        {
            
        }
        else
        {
        	System.out.println("Enter proper value");
        }
	}

}
