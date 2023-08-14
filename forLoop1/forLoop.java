package forLoop1;
import java.util.Scanner;
public class forLoop
{
	public static void main(String[] args)
	{
		//Number----------------------------------------------------------------------------------------

		//1) Write a Program To print 1 to 25 nos.
		                for(int i=1; i<=25; i++)
					System.out.println(i);


		//2) Write a Program To print 25 to 1 nos.
		                for(int i=25; i>=1; i--)
					System.out.println(i);


		//3) Write a Program To print 1 to 100 Odd nos.
		                for(int i=1; i<=100; i++)
				{
					if(i%2!=0)
						System.out.println(i);
				}


		//4) Write a Program To print 1 to 100 even nos.
		                for(int i=1; i<=100; i++)
				{
					if(i%2==0)
						System.out.println(i);
				}


		//5) Write a Program To print sum of 1 to 50 Odd nos.
		                int sum = 0;
				for(int i=1; i<=50; i++)
				{
					if(i%2!=0)
					{
						sum = sum+i;
					}
				}
				System.out.println(sum);


		//6) Write a Program To print sum of 1 to 50 EVEN nos.
		                int sum1 = 0;
				for(int i=1; i<=50; i++)
				{
					if(i%2==0)
					{
						sum1 = sum1+i;
					}
				}
				System.out.println(sum1);	


		//7) Write a Program To print -45 to +45 nos.  // negative no and positive no
		                for(int i= -45; i<=45; i++)
					System.out.println(i);


		//8) Write a Program To print 50 to 100 nos.
		                for(int i=50; i<=100; i++)
					System.out.println(i);


		//9) Write a Program To print sum of odd and even no.
		                Scanner sc =  new Scanner(System.in);
				System.out.println("Enter a Number: ");
				int n = sc.nextInt();
				
				int evenSum = 0, oddSum = 0;
				for(int i=1; i<=n; i++)
				{
					if(i%2==0)
						evenSum = evenSum + i;
					else
						oddSum = oddSum + i;
				}
				System.out.println("Sum of Even numbers: "+evenSum);
				System.out.println("Sum of Odd numbers: "+oddSum);


		//10) Write a Program To print even and odd No
		       
				System.out.println("Enter a Number: ");
				int n1 = sc.nextInt();
				
				System.out.println("Odd Numbers: ");
				for(int i=1; i<=n1; i++)
				{
					if(i%2!=0)
					    System.out.println(i);
					
				}
				
				System.out.println("Even Numbers: ");
				for(int i=1; i<=n1; i++)
				{
					if(i%2==0)
					    System.out.println(i);
					
				}


		//11) Write a Program To print 1 to 100 no.
		                 for(int i=1; i<=100; i++)
					System.out.println(i);


		//12) Write a Program To print 100 to 1 no.
		                 for(int i=100; i>=1; i--)
					System.out.println(i);


		//13) Write a Program To print 30 to 50 no.
		                for(int i=30; i<=50; i++)
		        	        System.out.println(i);


		//14) Write a Program To print count of even No 1 to 25 no.
		        int count = 0;
				for(int i=1; i<=25; i++)
				{
					if(i%2==0)
					    count++;
				}
				System.out.println("Count of Even Numbers is: "+count);


		//15) Write a Program To print count of odd No 1 to 25 no.
		        int count1 = 0;
				for(int i=1; i<=25; i++)
				{
					if(i%2!=0)
					    count1++;
				}
				System.out.println("Count of Even Numbers is: "+count1);







		//SERIES------------------------------------------------------------------------------------------------------


		//1) Generate the Series... 2 4 6 8 10 12 14 16 18 20.
		        for(int i=2; i<=20; )
				{
					System.out.print(i+" ");
					i = i+2;
				}



		//2)Generate the Series... 9 18 27 36 45 54 63 72 81 90. 
				for(int i=9; i<=90; )
				{
					System.out.print(i+" ");
					i = i+9;
				}


		//3)Generate the Series... 1 -2 3 -4 5 -6 7 -8 9 -10.
				for(int i=1; i<=10; i++)
				{
					if(i%2!=0)
					    System.out.print(i+" ");
					else
						System.out.print(-i + " ");
				}


		//4)Generate the Series... 5 10 15 20 25 30 35 40 45 50.
				for(int i=5; i<=50; )
				{
					System.out.print(i+" ");
					i = i+5;
				}


		//5)Generate the Series... 1 10 100 1000.
				for(int i=1; i<=1000; )
				{
					System.out.print(i+" ");
					i = i*10;
				}


		//6)Generate the Series... 1  3  6  10  15  21  28  36  45.
				int sum2 = 0;
				for(int i=1; i<10;i++ )
				{
					sum2 = sum2+i;
					System.out.print(sum2+" ");		
				}


		//7)Generate the Series... 8 16 24 32 40 48 56 64 72 80.
				for(int i=8; i<=80; )
				{
					System.out.print(i+" ");
					i = i+8;
				}


		//8)Generate the Series... 0 1 1 2 3 5 8 13 21.
		        int a=-1, b=1, c=0;
		        for(int i=1; i<=10; i++)
		        {
		            c = a+b;
		            System.out.print(c+" ");
		            a=b;
		            b=c;
		        }

		//9) Generate the series... 1 4 9 16 25 36 49 64 81 100.
		        for(int i=1; i<=10; i++)
		            System.out.print((i*i)+" ");


		//10) Generate the series... 3 6 9 12 15 18 21 24 27 30.
		        for(int i=3; i<=30; )
		        {
		            System.out.print(i+" ");
		            i+=3;
		        }


		//11) Generate the Series... 7 14 21 28 35 42 49 56 63 70. 
		        for(int i=7; i<=70; )
		        {
		            System.out.print(i+" ");
		            i+=7;
		        }


		//12)Generate the Series... 4 8 12 16 20 24 28 32 36 40. 
		        for(int i=4; i<=40; )
		        {
		            System.out.print(i+" ");
		            i+=4;
		        }


		//13) Generate the Series... 10 20 30 40 50 60 70 80 90 100. 
		        for(int i=10; i<=100; )
		        {
		            System.out.print(i+" ");
		            i+=10;
		        }


		//14) Generate the Series... 1 2 3 4 5 4 3 2 1.  
		        int i;
		        for( i=1; i<5;i++)
		            System.out.print(i+" ");
		        for( ; i>=1;i--)
		            System.out.print(i+" ");
		        

		//15) Generate the Series... 6 12 18 24 30 36 42 48 54 60. 
		        for(int i1=6; i1<=60;)
		        {
		            System.out.print(i1+" ");
		            i1+=6;
		        }

		
	}

}
