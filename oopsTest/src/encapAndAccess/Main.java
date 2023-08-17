package encapAndAccess;

public class Main 
{

	public static void main(String[] args) 
	{
		BankAccount b1 = new BankAccount(123, 20000, "Ram");
		b1.showDetails(b1);
		b1.deposit(1000);
		b1.showDetails(b1);
		b1.withdraw(5000);
		b1.showDetails(b1);
		
		
		BankAccount b2 = new BankAccount(431, 50000, "Shyam");
		b2.showDetails(b2);

	}

}
