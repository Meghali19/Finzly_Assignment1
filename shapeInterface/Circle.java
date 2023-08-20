package shapeInterface;

public class Circle implements Shape
{
	private double radius;
	
	public Circle(double radius)
	{
		this.radius = radius;
	}

	public double getRadius() 
	{
		return radius;
	}

	public void setRadius(double radius) 
	{
		this.radius = radius;
	}

	@Override
	public double calculateArea()
	{
		return 3.14*radius*radius;
	}

	@Override
	public double calculatePerimeter() 
	{
		return 2*3.14*radius;
	}
	
	public void display()
	{
		System.out.println("Area of Circle: "+calculateArea());
		System.out.println("Area of Circle: "+calculatePerimeter());
	}

}
