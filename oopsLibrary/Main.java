package oopsLibrary;

public class Main {

	public static void main(String[] args)
	{
        Book b1 = new Book("Mahatma Gandhi", "Hind Swaraj", 101);
        b1.displayInfo();
        
        Dvd d1 = new Dvd(150, "Harry potter-part 1", 102);
        d1.displayInfo();
        
        FacultyMember f1 = new FacultyMember(12345, "John", b1, d1);
        f1.borrowItem();
        
        StudentMember s1 = new StudentMember(54321, "Nick", b1,d1);
        s1.borrowItem();

	}

}
