package Country;

import java.util.HashSet;

public class Main 
{
	public static void main(String[] args)
	{
		States s = new States();
		HashSet<City> city = s.m1();

		for (City c : city) 
		{  
			if(c.getStateName()=="MP")
			{
				System.out.println(c);
			}			
		}
	}
}
