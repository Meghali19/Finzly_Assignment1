package shapeInterface;

public class Main {

	public static void main(String[] args)
	{
		Circle c1 = new Circle(2);
		c1.calculateArea();
		c1.calculatePerimeter();
		c1.display();
		
		Rectangle r1 = new Rectangle(2,4);
		r1.calculateArea();
		r1.calculatePerimeter();
		r1.display();
		
		Triangle t1 = new Triangle(2,5,3,4);
		t1.calculateArea();
		t1.calculatePerimeter();
		t1.display();

	}

}
