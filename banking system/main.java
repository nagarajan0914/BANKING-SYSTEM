package bank;
import java.util.*;
public class main {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		customerService customerservice = new customerService();
		int accNum=10000;
		while(flag) {
			System.out.println("------------------");
			System.out.println("WELCOME TO KUMAR BANK");
			System.out.println(" 1.Create Account\n 2.Deposit\n 3.Withdraw\n 4.Transfer\n 5.BankStatment\n 6.Balance\n 7.Exit");
			System.out.println("------------------");
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:{
				accNum++;
		    	System.out.println("Enter your Name:");
		    	String name = sc.next();
		    	System.out.println("Enter your Age:");
		    	int age = sc.nextInt();
		    	System.out.println("Set your pin_number:");
		    	int pin = sc.nextInt();
		    	account acc = new account(name,age,pin);
				customerservice.createAccount(acc,accNum);
				
			}
			break;
			case 2:{
				System.out.println("Enter acc No in which you have to deposit:");
				int accNo=sc.nextInt();
				System.out.println("Enter password: ");
				int pass = sc.nextInt();
				System.out.println("enter amount to deposit:");
				int amt = sc.nextInt();
				customerservice.deposit(accNo,pass,amt);
			}
			break;
			case 3:{
				System.out.println("Enter acc No in which you have to withdraw amount:");
				int accNo=sc.nextInt();
				System.out.println("Enter password: ");
				int pass = sc.nextInt();
				System.out.println("enter amount to withdraw:");
				int amt = sc.nextInt();
				customerservice.withdraw(accNo,pass,amt);
			}
			break;
			case 4:{
				System.out.println("Enter acc No in which you have to transfer from:");
				int accNo1=sc.nextInt();
				System.out.println("Enter password: ");
				int pass = sc.nextInt();
				System.out.println("Enter the account number of in which you have to send:");
				int accNo2=sc.nextInt();
				System.out.println("Enter amount to transfer:");
				int amt = sc.nextInt();
                customerservice.transfer(accNo1,pass,accNo2,amt);
			}
			break;
			case 5:{
				System.out.println("Enter acc No in which you have to check bankstatement:");
				int accNo=sc.nextInt();
				System.out.println("Enter password: ");
				int pass = sc.nextInt();
				customerservice.bankStatement(accNo,pass);
			}
			break;
			case 6:{
				System.out.println("Enter acc No in which you have check balance:");
				int accNo=sc.nextInt();
				System.out.println("Enter password: ");
				int pass = sc.nextInt();
				customerservice.balance(accNo,pass);
			}
			break;
			case 7:{
				flag=false;
				System.out.println("Thank you visit again!!!");
			}
			}
		
		}
	}

}