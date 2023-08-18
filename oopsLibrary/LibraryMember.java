package oopsLibrary;

public abstract class LibraryMember
{
	protected int memberId;
	protected String name;
	
	public LibraryMember(int memberId, String name) 
	{
		super();
		this.memberId = memberId;
		this.name = name;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void borrowItem();
	

}
