package finalAndConstructor;

public class Antivirus
{
	public Antivirus()
	{
		System.out.println("You are using free version, please Upgrade");
	}
	
	public Antivirus(Transaction tr)
	{ 
		if(tr.getProductKey()!=0)
		{
			System.out.println("Transaction is done, Your ProductKey is: "+ tr.getProductKey() + ", Enjoy your plan !!");
		}
		
	}
	
	public static void main(String[] args)
	{
		Antivirus a1 = new Antivirus();
		
		Antivirus a2 = new Antivirus();
		
		Transaction t1 = new Transaction(0);
		Antivirus a3 = new Antivirus(t1);		
		
		Transaction t2 = new Transaction(1000);
		Antivirus a4 = new Antivirus(t2);
	}

}
