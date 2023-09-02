package bank;

public class Customer 
{
	private int accNo;
    private String name;
    private static double balance;
    private double empBalance;
    
    public Customer()
    {
    }

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public static double getBalance() {
		return balance;
	}

	public static void setBalance(double balance) {
		Customer.balance = balance;
	}

	public double getEmpBalance() {
		return empBalance;
	}

	public void setEmpBalance(double empBalance) {
		this.empBalance = empBalance;
	}
	

	public Customer(int accNo, String name, double balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		Customer.balance = balance;
		this.setEmpBalance(Customer.balance);
	}

	@Override
	public String toString() {
		return "Customer [accNo=" + accNo + ", name=" + name + " Balance=" + empBalance + "]";
	}

	
 
    
}
