package abstractionAndInterface;

public class Main
{
	public static void main(String[] args)
	{
		SavingsAccount sa = new SavingsAccount(1.0, "ABC123", "Ram", 5000);
		System.out.println(sa.getBalance());
		
		sa.deposit(2000);
		sa.displayDetails();
		
		sa.withdraw(6000);
		sa.displayDetails();
		
		sa.withdraw(3000);
		sa.displayDetails();
		
		sa.withdraw(6000);
		sa.displayDetails();
		
		CheckingAccount ca = new CheckingAccount("XYZ231", "Shyam", 10000);
		
		ca.deposit(2000);
		ca.displayDetails();
		
		ca.withdraw(5000);
		ca.displayDetails();
		
		ca.withdraw(8000);
		ca.displayDetails();
		
		ca.deposit(2000);
		ca.displayDetails();
		
	}

}
