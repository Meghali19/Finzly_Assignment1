package com;

public class Vowels 
{
	public static int checkVowels(String str)
	{
		int a[] = new int[5];
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)=='A' || str.charAt(i)=='a')
				a[0]=1;
			else if(str.charAt(i)=='E' || str.charAt(i)=='e')
				a[1]=1;
			else if(str.charAt(i)=='I' || str.charAt(i)=='i')
				a[2]=1;
			else if(str.charAt(i)=='O' || str.charAt(i)=='o')
				a[3]=1;
			else if(str.charAt(i)=='U' || str.charAt(i)=='u')
				a[4]=1;
		}
		
		for(int i=0; i<5; i++)
		{
			if(a[i]==0)
				return 1;
		}
		
		return 0;
	}

	public static void main(String[] args) 
	{
		String str = "Encapsulation";
		
		if(checkVowels(str)==1)
		{
			System.out.println(str + " does not contains all vowels");
		}
		else
		{
			System.out.println(str + " contains all vowels");
		}

	}

}
