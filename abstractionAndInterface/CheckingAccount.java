package abstractionAndInterface;

public class CheckingAccount extends BankAccount
{
	private double overdraft=0;

	public CheckingAccount(String accountNumber, String accountHolderName, double balance)
	{
		super(accountNumber, accountHolderName, balance);
	}

	public double getOverdraft()
	{
		return overdraft;
	}

	public void setOverdraft(double overdraft)
	{
		this.overdraft = overdraft;
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
		if(amount>balance)
		{
			overdraft = amount - balance;
			System.out.println("Your account has "+balance+" Rs. So you are overdrafting/borrowing "+overdraft+" Rs from the Bank!!");
		    this.setOverdraft(overdraft);	
			balance = 0;
			this.setBalance(balance);
			System.out.println(amount+" Rs is withdraw from your account . Now Your account has "+balance+" in your account.");
			
		}
		else if(amount<balance)
		{
			balance -= amount;
			this.setBalance(balance);
			System.out.println(amount+ " Rs is withraw from your account.");
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
