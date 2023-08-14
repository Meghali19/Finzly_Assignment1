package whileLoop;

import java.util.Scanner;

public class Number9 {

	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		
		int evenSum = 0, oddSum = 0, i=1;
		while(i<=n)
		{
			if(i%2==0)
				evenSum = evenSum + i;
			else
				oddSum = oddSum + i;
			i++;
		}
		System.out.println("Sum of Even numbers: "+evenSum);
		System.out.println("Sum of Odd numbers: "+oddSum);

	}

}
