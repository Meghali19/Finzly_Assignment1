package employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("-----------------------------------------------------");
			System.out.println("1 - Add Employee");
			System.out.println("2 - View Employee using Id");
			System.out.println("3 - View Employee List");
			
			System.out.println("Enter Choice: ");
			String choice = sc.nextLine();
			
			switch(choice)
			{
			    case "1":
			    	Operation.add();
			    	break;
			    	
			    case "2":
			    	System.out.println("Enter Employee Id: ");
			    	int id = sc.nextInt();
			    	Employee e = Operation.viewEmployee(id);
			    	System.out.println(e);
			    	break;
			    	
			    case "3":
			        Operation.viewEmployeeList();
			    	break;
			    	
			    default:
			    	System.out.println("Invalid Input");
			    	break;
			}
		}

	}

}
