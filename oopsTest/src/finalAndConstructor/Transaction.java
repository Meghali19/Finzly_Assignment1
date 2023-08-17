package finalAndConstructor;

public class Transaction
{
	private int amount;
	private final int productKey;
	
	public Transaction(int amount)
	{
		this.amount = amount;
         
		if(amount!=0)
			productKey = (int)(Math.random()*10000);
		else
		{
			productKey = 0;
			System.out.println("Transaction is not done - Please pay 1000 Rs first to activate product key");
		}
		
	}
	public int getProductKey()
	{
		return productKey;
	}
	

}
