package encapAndAccess;

public class BankAccount 
{
	private int accountNumber;
	private static long balance;
	private String ownerName;
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	
	public static long getBalance() 
	{
		return balance;
	}
	public static void setBalance(long balance) 
	{
		BankAccount.balance = balance;
	}
	
	public String getOwnerName()
	{
		return ownerName;
	}
	public void setOwnerName(String ownerName)
	{
		this.ownerName = ownerName;
	}
	
	public BankAccount(int accountNumber, long balance, String ownerName)
	{
		this.accountNumber = accountNumber;
		BankAccount.balance = balance;
		this.ownerName = ownerName; 	
	}
	
	public void deposit(long amount)
	{
		if(amount>0)
		{
			BankAccount.getBalance();
			balance += amount;
			BankAccount.setBalance(balance);
			System.out.println("Deposited amount of "+ amount);
		}
		else
			System.out.println("Enter valid amount");
	}
	
	public void withdraw(long amount)
	{
		BankAccount.getBalance();
		if(balance >= amount)
		{
			balance -= amount;
			BankAccount.setBalance(balance);
			System.out.println("Withdraw amount of "+ amount);
		}
		else
			System.out.println("Insufficient Balance !!");
	}
	
	public void showDetails(BankAccount ba)
	{
		System.out.println("-------------------------------------");
		System.out.println("Your Bank Details: ");
		System.out.println("Account Number: "+ accountNumber + "\nOwner name: "+ ownerName +"\nBalance: "+ balance);
	}
	
	
	

}
