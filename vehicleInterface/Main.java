package vehicleInterface;

public class Main 
{

	public static void main(String[] args)
	{
		Car c1 = new Car();
		c1.start();
		c1.accelerate();
		c1.brake();
		
		Motorbike m1 = new Motorbike();
		m1.start();
		m1.accelerate();
		m1.brake();
				
	}

}
