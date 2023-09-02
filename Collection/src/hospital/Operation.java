package hospital;

import java.util.HashMap;
import java.util.Scanner;

public class Operation 
{
	Scanner sc = new Scanner(System.in);
    HashMap<Integer, Patient> hm = new HashMap<>();
	
    static int key = 1;
    static int count = 0;
	public void add()
	{
		String name;
		if(count==0)
		{
			System.out.println("Enter Patient Name: ");
			name = sc.nextLine();
			count++;
		}
		else
		{
			System.out.println("Enter Patient Name: ");
			sc.nextLine();
			name = sc.nextLine();	
		}
		
		System.out.println("Enter Age of Patient: ");
		int age = sc.nextInt();
		
		System.out.println("Enter Patient's Gender: ");
		String gender = sc.nextLine();
		
		System.out.println("Enter Patient's Disease: ");
		String disease = sc.nextLine();
		
		Patient p = new Patient(name, gender, age, disease);
		
		
		hm.put(count, p);
		count++;
		
		System.out.println("Patient is added!!");
		
	}
	
	public void displayList()
	{
		System.out.println(hm);
	}

	public void displayPatient()
	{
		
	}
}
