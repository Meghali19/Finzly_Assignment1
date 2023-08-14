package whileLoop;

public class Number14 {

	public static void main(String[] args)
	{
		int i=1, count=0;
		while(i<=25)
		{
		    if(i%2==0)
		    	count++;
		    i++;
		}
		System.out.println("Count of even Numbers: "+count);

	}

}
