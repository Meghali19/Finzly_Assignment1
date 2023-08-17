package inheritanceAndPoly;

public class Giraffe extends Animal
{
	public Giraffe(String name, int age)
	{
		super(name, age);
	}
	@Override
	public void makeSound()
	{
		System.out.println("Giraffe sound");
	}

}
