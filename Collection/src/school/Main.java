package school;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("---------------------------");
			System.out.println("1 - Add Details");
			System.out.println("2 - Show Details");
			System.out.println("3 - Exit");
			
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			
			if(choice == 1)
			{
				Operation.add();
			}
			else if(choice == 2)
			{
				Operation.display();
	        }
			else if(choice == 3)
			{
				Operation.exit();
			}
			else
			{
				System.out.println("Invalid choice");
			}
		}
			

	}

}
