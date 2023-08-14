package whileLoop;

import java.util.Scanner;

public class Number10 {

	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		
		int i=1;
		System.out.println("Odd Number: ");
		while(i<=n)
		{
			if(i%2!=0)
				System.out.println(i);
			i++;
		}
		
		int j=1;
		System.out.println("Even Number: ");
		while(j<=n)
		{
			if(j%2==0)
				System.out.println(j);
			j++;
		}

	}

}
