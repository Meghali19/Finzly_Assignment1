
public class doWhileLoop 
{

	public static void main(String[] args)
	{
		//Numbers-------------------------------------------------------------------------------------------------------------------

		//1)...........................................
		       int i=1;
		       do{
		           System.out.println(i);
		           i++;
		       }
		       while(i<=25);


		//2)...........................................
		        int j=25;
		        do
		        {
		           System.out.println(j);
		           j--;
		        }
		        while(i>0);
		     

		//3)............................................
		        int k =1;
		        do
		        {
		           if(k%2!=0)
		               System.out.println(k);
		           k++;
		        }
		        while(k<=100);

		//4)............................................
		        int l=1;
		        do
		        {
		           if(l%2==0)
		               System.out.println(l);
		           l++;
		        }
		        while(l<=100);

		//5)............................................
		        int m=1, sum=0;
		        do
		        {
		           if(m%2!=0)
		               sum = sum+m;
		           m++;
		        }
		        while(m<=50);
		        System.out.println("Sum of Odd Numbers: "+sum);

		//6).........................................................
		        int n=1, sum1=0;
		        do
		        {
		           if(n%2==0)
		               sum1 = sum1+n;
		           n++;
		        }
		        while(n<=50);
		        System.out.println("Sum of Even Numbers: "+sum1);

		//7).........................................................
		        int x=-45;
		        do
		        {
		           System.out.println(x);
		           x++;
		        }
		        while(x<=45);

		//8).........................................................
		        int y=50;
		        do
		        {
		           System.out.println(y);
		           y++;
		        }
		        while(y<=100);

		//9).........................................................
		        int z=1, n1=9, even=0, odd=0;
		        do
		        {
		            if(z%2==0)
		               even+=z;
		            else
		               odd+=z;
		           z++;
		        }
		        while(z<=n1);
		        System.out.println("Sum of Even numbers:"+ even);
		        System.out.println("Sum of Odd numbers:"+ odd);

		//10).........................................................
		        int i1=1, n2=10;
		        System.out.println("Even Numbers: ");
		        do
		        {
		            if(i1%2==0)
		               System.out.println(i1);
		           i1++;
		        }
		        while(i1<=n2);        
		       
		       int j1=1; 
		        System.out.println("Odd Numbers: ");
		        do
		        {
		            if(j1%2!=0)
		               System.out.println(j1);
		           j1++;
		        }
		        while(j1<=n2);

		//11).........................................................
		        int i3=1;
		        do
		        {
		           System.out.println(i3);
		           i3++;
		        }
		        while(i3<=100);

		//12).........................................................
		        int i4=100;
		        do
		        {
		           System.out.println(i4);
		           i4--;
		        }
		        while(i4>=1);

		//13).........................................................
		        int i5=30;
		        do
		        {
		           System.out.println(i5);
		           i5++;
		        }
		        while(i5<=50); 

		//14).........................................................
		        int i6=1, count1 = 0;
		        do
		        {
		           if(i6%2==0)
		              count1++;
		           i6++;
		        }
		        while(i6<=25);        
		        System.out.println(count1);

		//15).........................................................
		        int i7=1, count3 = 0;
		        do
		        {
		           if(i7%2!=0)
		              count3++;
		           i7++;
		        }
		        while(i7<=25);        
		        System.out.println(count3);






		//SERIES----------------------------------------------------------------------------------------------------------------------------


		//1).........................................................
		        int i8=2;
		        do
		        {
		           System.out.print(i8+" ");
		           i8+=2;
		        }
		        while(i8<=20);

		//2).........................................................
		        int i9=9;
		        do
		        {
		           System.out.print(i9+" ");
		           i9+=9;
		        }
		        while(i9<=90);

		//3).........................................................
		        int m1=1;
		        do
		        {
		            if(m1%2!=0)    
		                System.out.print(m1+" ");
		            else
		                System.out.print(-m1+" ");
		            
		           m1++;
		        }
		        while(m1<=10);

		//4).........................................................
		        int m2=5;
		        do
		        {
		            System.out.print(m2+" ");
		            m2+=5;
		        }
		        while(m2<=50);

		//5).........................................................
		        int m3=1;
		        do
		        {
		            System.out.print(m3+" ");
		            m3*=10;
		        }
		        while(m3<=1000);

		//6).........................................................
		        int m4=1, sum4=0;
		        do
		        {
		            sum4+=m4;
		            System.out.print(sum4+" ");
		            m4++;
		        }
		        while(m4<10);

		//7).........................................................
		        int m5=8;
		        do
		        {
		            System.out.print(m5+" ");
		            m5+=8;
		        }
		        while(m5<=80);

		        //8).........................................................
		        int m6=1,a=-1, b=1,c=0;
		        do
		        {
		            c= a+b;
		            System.out.print(c+" ");
		            m6++;
		            a=b;
		            b=c;
		        }
		        while(m6<10);        

		//9).........................................................
		        int m7=1;
		        do
		        {
		            System.out.print((m7*m7) +" ");
		            m7++;
		        }
		        while(m7<=10);

		//10).........................................................
		        int m8=3;
		        do
		        {
		            System.out.print(m8 +" ");
		            m8+=3;
		        }
		        while(m8<=30);

		//11).........................................................
		        int m9=7;
		        do
		        {
		            System.out.print(m9 +" ");
		            m9+=7;
		        }
		        while(m9<=70);

		//12).........................................................
		        int x1=4;
		        do
		        {
		            System.out.print(x1 +" ");
		            x1+=4;
		        }
		        while(x1<=40);

		//13).........................................................
		        int x2=10;
		        do
		        {
		            System.out.print(x2 +" ");
		            x2+=10;
		        }
		        while(x2<=100); 

		//14).........................................................
		        int x3=1;
		        do
		        {
		            System.out.print(x3 +" ");
		            x3++;
		        }
		        while(x3<5);
		        
		        do
		        {
		            System.out.print(x3 +" ");
		            x3--;
		        }
		        while(x3>=1);

		//15).........................................................
		        int x4=6;
		        do
		        {
		            System.out.print(x4 +" ");
		            x4+=6;
		        }
		        while(x4<=60);


	}

}
