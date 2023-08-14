package whileLoop;

public class Series8 {

	public static void main(String[] args) 
	{
		int i=1, a=-1, b=1, c=0;
		while(i<10)
		{
			c = a+b;
			System.out.print(c+" ");
			i++;
			a=b;
			b=c;
		}

	}

}
