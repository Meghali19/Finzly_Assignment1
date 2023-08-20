package shapeInterface;

public class Rectangle implements Shape 
{
	private double length;
	private double width;
	
	public Rectangle(double length, double width)
	{
		this.setLength(length);
		this.setWidth(width);				
	}

	public double getLength() 
	{
		return length;
	}

	public void setLength(double length)
	{
		this.length = length;
	}

	public double getWidth()
	{
		return width;
	}

	public void setWidth(double width) 
	{
		this.width = width;
	}

	@Override
	public double calculateArea() 
	{
		return length*width;
	}

	@Override
	public double calculatePerimeter()
	{
		return 2*(length + width);
	}
	
	public void display()
	{
		System.out.println("Area of Reactangle: "+calculateArea());
		System.out.println("Area of Rectangle: "+calculatePerimeter());
	}
	
    
}
