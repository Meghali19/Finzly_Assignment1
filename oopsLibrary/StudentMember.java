package oopsLibrary;
public class StudentMember extends LibraryMember
{
    Book b1;
    Dvd d1;
	
	public StudentMember(int memberId, String name, Book b1, Dvd d1)
	{
		super(memberId, name);
		this.b1 = b1;
		this.d1 = d1;
	}

	@Override
	public void borrowItem() 
	{
		System.out.println(memberId+" - Name: "+name+" borrowed "+ d1.getTitle());
	}

}
