package ipl;
import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args)
	{
		Operation o = new Operation();
		ArrayList<Player> list = o.m1();
		
		for (Player player : list) 
		{
			if(player.getLoc() == "Mumbai") 
			{
				System.out.println(player);
			}
		}	
	}

}
