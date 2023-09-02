package bank;

import java.util.Vector;
import java.util.Scanner;

public class Operation 
{
	static Scanner sc = new Scanner(System.in);
	static Vector<Customer> list = new Vector<>();
	static int count =0;
	
	public static void addAccount()
	{
		
		String name;
		if(count==0)
		{
			System.out.println("Enter Your Name: ");
			name = sc.nextLine();
			count++;
		}
		else
		{
			System.out.println("Enter Your Name: ");
			sc.nextLine();
			name = sc.nextLine();	
		}
		
		System.out.println("Enter your Account Number: ");
		int accNo = sc.nextInt();
		
		System.out.println("Enter Initial Amount: ");
		double balance = sc.nextDouble();
		
		Customer c = new Customer();
		c.setName(name);
		c.setAccNo(accNo);
		Customer.setBalance(balance);
		c.setEmpBalance(Customer.getBalance());
		
		list.add(c);
	    System.out.println("Acount is created...");
		
	}
	
	
	public static void withdraw(int accNo, double amount)
	{

		Vector<Customer> v = list;
		for (Customer customer : v) 
		{
			if(customer.getAccNo()==accNo)
			{
				double balance = customer.getEmpBalance();
				if((balance-amount)>0)
				{
					balance -= amount;
					customer.setEmpBalance(balance);
					System.out.println("Amount is withdraw!!");
				}
				else
				{
					System.out.println("Sorry...Insuffient balance!!");
				}
			}
			else
			{
				System.out.println("Enter Proper Account Number");
			}
			
		}
		
	}
	
	
	public static void deposit(int accNo, double amount)
	{
		Vector<Customer> v = list;
		for (Customer customer : v) 
		{
			if(customer.getAccNo()==accNo)
			{
				double balance = customer.getEmpBalance();
				if(amount>0)
				{
					balance += amount;
					customer.setEmpBalance(balance);
					System.out.println("Amount is deposited!!");
				}
				else
				{
					System.out.println("Enter Appropriate Amount(i.e greater than zero)");
				}

			}
			else
			{
				System.out.println("Enter Proper Account Number");
			}
			
		}
	}
	
	public static void checkBalance(int id)
	{
		Vector<Customer> v = list;
		for (Customer customer : v) 
		{
			if(customer.getAccNo()==id)
			{
				System.out.println("Balance in your account: "+ customer.getEmpBalance());
			}
			
		}
	}
	
	public static void viewAllAccount()
	{
		Vector<Customer> v = list;
		for (Customer customer : v) 
		{
			System.out.println(customer);
			
		}
	}
	

}
