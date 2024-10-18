package bank;
import java.util.*;

import BankApplication.Account;
public class customerService {

	  Map<Integer,account> accountInformation = new HashMap<>();
	  Map<Integer,List<String>> transactionHistory = new HashMap<>();
	  List<String> list = new ArrayList<>();
	  
	public void createAccount(account acc,int accNum) {
		
    	accountInformation.put(accNum, acc);
    	acc.balance=1000;
    	System.out.println("Your Account Created Succesfully");
    	System.out.println("Your Acc_Num:"+accNum);
		
		//list.add("Opening : 1000");
		transactionHistory.put(accNum, list);
	}
	public void deposit(int accNo,int pass,int amt){
		
		account acc = accountInformation.get(accNo);
		if(acc.password==pass) {
			acc.balance+=amt;
			
			list.add("Deposited--"+amt);
			transactionHistory.put(accNo, list);
			System.out.println("Deposited succesfully");
		}
		else
			System.out.println("wrong password or acc number try again!!!");
		
	}
	public void balance(int accNo,int pass) {
		account acc = accountInformation.get(accNo);
		System.out.println("your balance :"+acc.balance);
		
	}
	public void withdraw(int accNo,int pass,int amt) {
		account acc = accountInformation.get(accNo);
		if(acc.password==pass) {
			if(amt<=acc.balance)
			{
				System.out.println("Amount withdraw succesfull");
				//List<String> list = new ArrayList<>();
				list.add("Withdrawn--"+amt);
				transactionHistory.put(accNo, list);
				acc.balance-=amt;
			}
			else
				System.out.println("insufficent balance!!!");
		}
		else
			System.out.println("password incorrect!!!");
	}
	public void transfer(int accNo1,int pass , int accNo2 , int amt) {
		account acc1 = accountInformation.get(accNo1);
		account acc2 = accountInformation.get(accNo2);
		if(acc1.password==pass) {
			if(acc1.balance>=amt) {
				acc2.balance+=amt;
				acc1.balance-=amt;
				//List<String> list = new ArrayList<>();
				list.add("Transfer-- "+amt);
				transactionHistory.put(accNo1, list);
				System.out.println("Amount transfered succesfully!!!");
			}
			else
				System.out.println("Insufficeint balance!!!");
		}
		else
			System.out.println("Wrong password Try Again!!!");

	}
	public void bankStatement(int accNo,int pass) {
		account acc = accountInformation.get(accNo);
		if(acc.password==pass) {
			System.out.println(transactionHistory.get(accNo));
		}
	}
	
	
}
