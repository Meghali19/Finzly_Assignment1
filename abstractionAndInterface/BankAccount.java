package abstractionAndInterface;

public abstract class BankAccount
{
	protected String accountNumber;
	protected String accountHolderName;
	protected static double balance;
	
	public BankAccount(String accountNumber, String accountHolderName, double balance)
	{
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		BankAccount.balance = balance;
	}

	public abstract String getAccountNumber();
	public abstract String getAccountHolderName();
	public abstract double getBalance();
	public void setBalance(double balance)
	{
		BankAccount.balance = balance;
	}
	public abstract void withdraw(double amount);
	public abstract void deposit(double amount);
	
}
