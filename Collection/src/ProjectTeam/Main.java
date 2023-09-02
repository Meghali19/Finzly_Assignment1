package ProjectTeam;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
	{
    	Scanner sc = new Scanner(System.in);
    	Operation o = new Operation();
    	int choice;
    	do{
    		System.out.println("1 - Add Project");
    		System.out.println("2 - View Project");
    		System.out.println("3 - View All Projects");
    		System.out.println("4 - Exit");
    		System.out.println("Enter your choice: ");
    		choice = sc.nextInt();
    		
    		switch (choice)
    		{
			    case 1:
				    o.addProject();
				    break;
				   
			    case 2:
			    	System.out.println("Enter ProjectID: ");
			    	int id = sc.nextInt();
				    o.viewProject(id);
				    break;
				   
			    case 3:
				    o.allProjects();
				    break;
				    
			    case 4:
				    o.ExitProgram();
				    break;

			    default:
				    System.out.println("Invalid Input");
				    break;
			}
    	}while(choice != 4);
		sc.close();
	}

}
