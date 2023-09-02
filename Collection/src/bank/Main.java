package bank;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean value = true;
		do
		{
			System.out.println("-----------------------------------------------------");
			System.out.println("1 - Add Acount");
			System.out.println("2 - Deposit Money");
			System.out.println("3 - Withdraw Money");
			System.out.println("4 - Check Balance");
			System.out.println("5 - View All Accounts");
			System.out.println("6 - Exit");
			
			System.out.println("Enter Choice: ");
			String choice = sc.nextLine();
			double amount;
			int accNo;
			
			switch(choice)
			{
			    case "1":
				    Operation.addAccount();
				    break;
				    
			    case "2":
			    	System.out.println("Enter your Account Number: ");
					accNo = sc.nextInt();
			    	System.out.println("Enter amount to deposit: ");
			    	amount = sc.nextDouble();
			    	Operation.deposit(accNo, amount);
			    	break;
			    	
			    case "3":
			    	System.out.println("Enter your Account Number: ");
					accNo = sc.nextInt();
			    	System.out.println("Enter amount to withdraw: ");
			    	amount = sc.nextDouble();
			    	Operation.withdraw(accNo, amount);
			    	break;
			    	
			    case "4":
			    	System.out.println("Enter your Account Number: ");
			    	int id = sc.nextInt();
			    	Operation.checkBalance(id);
			    	break;
			    
			    case "5":
			    	Operation.viewAllAccount();
			    	break;
			    
			    case "6":
			    	value = false;
			    	break;
			    default:
			    	System.out.println("Invalid choice");
			    	break;
			    	
			}
		}while(value);
	}

}
