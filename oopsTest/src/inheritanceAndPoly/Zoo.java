package inheritanceAndPoly;

public class Zoo 
{

	public static void main(String[] args)
	{
		Animal a = new Animal("Animal", 1);
		a.makeSound();
		
	    a = new Lion("Lion", 10);
		a.makeSound();
		
		a = new Giraffe("Giraffe", 15);
		a.makeSound();
		
		a = new Elephant("Elephant", 20);
		a.makeSound();

	}

}
