package vehicleInterface;

public class Car implements Vehicle
{
	public void start()
	{
	    System.out.println("Car is started");	
	}
	public void accelerate()
	{
		System.out.println("Car is accelerated");
	}
	public void brake()
	{
		System.out.println("Brake applied on car");
	}
}
