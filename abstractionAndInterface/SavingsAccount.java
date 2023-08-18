package abstractionAndInterface;

public class SavingsAccount extends BankAccount
{
	private double interestRate;
	
	public SavingsAccount(double interestRate, String accountNumber, String accountHolderName, double balance)
	{
		super(accountNumber, accountHolderName, balance);
		this.interestRate = interestRate;
	}
	
	public double getInterestRate()
	{
		return interestRate;
	}
	public void setInterestRate(double ineterestRate)
	{
		this.interestRate = ineterestRate;
	}

	@Override
	public String getAccountNumber()
	{
		return accountNumber;
	}

	@Override
	public String getAccountHolderName()
	{
		return accountHolderName;
	}

	@Override
	public double getBalance()
	{
		return balance;
	}

	@Override
	public void withdraw(double amount) 
	{
		if((balance-amount)>=2000)
		{
			if(amount<balance)
			{
				balance -= amount;
				this.setBalance(balance);
				System.out.println(amount+ " Rs is withraw from your account.");
			}
			else
				System.out.println("Insufficient balance!!");
		}
		else
		{
			System.out.println("Sorry Try for another Amount. Balance should be 2000 Rs atleast after withdrawing money !!");
		}
		
	}

	@Override
	public void deposit(double amount) 
	{
		if(amount>0)
		{
			balance += amount;
			this.setBalance(balance);
			System.out.println(amount+" Rs is deposited in your account.");
		}
	}
	
	public void displayDetails()
	{
		System.out.println(accountHolderName+ ", Account Number "+ accountNumber +", Your current balance is "+balance);
	}

}
