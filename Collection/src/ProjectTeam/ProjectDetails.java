package ProjectTeam;

import java.util.HashSet;

public class ProjectDetails 
{
	private int ProjectID;
	private String projectName;
	private String description;
	private HashSet<String>teamMember;
	
	
	public ProjectDetails()
	{
	}
	
	
	public ProjectDetails(int projectID, String projectName, String description, HashSet<String> teamMember) {
		super();
		ProjectID = projectID;
		this.projectName = projectName;
		this.description = description;
		this.teamMember = teamMember;
	}


	public int getProjectID() {
		return ProjectID;
	}


	public void setProjectID(int projectID) {
		ProjectID = projectID;
	}


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public HashSet<String> getTeamMember() {
		return teamMember;
	}


	public void setTeamMember(HashSet<String> teamMember) {
		this.teamMember = teamMember;
	}


	@Override
	public String toString() {
		return "ProjectDetails [ProjectID=" + ProjectID + ", projectName=" + projectName + ", description="
				+ description + ", teamMember=" + teamMember + "]";
	}
	
	

}
