package oopsLibrary;
public class FacultyMember extends LibraryMember
{
	Book b1;
	Dvd d1;
	
	public FacultyMember(int memberId, String name, Book b1, Dvd d1)
	{
		super(memberId, name);
		this.b1 = b1;
		this.d1 = d1;
	}

	@Override
	public void borrowItem()
	{
		System.out.println(memberId+" - Name: "+name+" borrowed "+ b1.getTitle());
	}

}
