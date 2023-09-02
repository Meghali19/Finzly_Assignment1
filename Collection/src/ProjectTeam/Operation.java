package ProjectTeam;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Operation 
{
	 Scanner sc = new Scanner(System.in);
     HashMap<Integer, ProjectDetails> allProjects = new HashMap<>();
    
	
	public void addProject()
	{
		System.out.println("Enter Project ID: ");
		int projectID = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Project Name: ");
		String projectName = sc.nextLine();
		
		System.out.println("Enter Project Description: ");
		String description = sc.nextLine();
		
		HashSet<String> teamMember = new HashSet<>();
		System.out.println("Enter Team Members: (Enter 'DONE' at time of finish)");
		do{
			String name = sc.nextLine();
			if(name.equalsIgnoreCase("done"))
				break;
			
			teamMember.add(name);
		}while(true);
		
		
		ProjectDetails pd = new ProjectDetails(projectID, projectName, description, teamMember);
		allProjects.put(projectID, pd);

		System.out.println("Project is added!!");
		
	}

	public void viewProject(int id) 
	{
		ProjectDetails viewProject = allProjects.get(id);
		if(viewProject!=null)
		{
			System.out.println(viewProject);
		}
		else
		{
			System.out.println("'Invalid ProjectID', please enter valid project id.");
		}
	}

	public void allProjects() 
	{
		System.out.println("----------Display all projects----------");
	    for(ProjectDetails project : allProjects.values())
	    {
	    	System.out.println(project);
	    }
		
	}

	public void ExitProgram() 
	{
		System.out.println("EXIT");
		System.exit(0);
		
	}

}
