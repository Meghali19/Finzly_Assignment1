package shapeInterface;

public class Triangle implements Shape 
{
    private double base, h, side1, side2;

	public Triangle(double base, double h, double side1, double side2)
	{
		this.base = base;
		this.h = h;
		this.side1 = side1;
		this.side2 = side2;
	}

	public double getBase()
	{
		return base;
	}

	public void setBase(double base) 
	{
		this.base = base;
	}

	public double getH()
	{
		return h;
	}

	public void setH(double h) 
	{
		this.h = h;
	}

	public double getSide1()
	{
		return side1;
	}

	public void setSide1(double side1) 
	{
		this.side1 = side1;
	}

	public double getSide2()
	{
		return side2;
	}

	public void setSide2(double side2)
	{
		this.side2 = side2;
	}

	@Override
	public double calculateArea()
	{
		return (base*h)/2;
	}

	@Override
	public double calculatePerimeter()
	{
		return side1+side2+base;
	}
	
	public void display()
	{
		System.out.println("Area of Triangle: "+calculateArea());
		System.out.println("Area of Triangle: "+calculatePerimeter());
	}
    
}
