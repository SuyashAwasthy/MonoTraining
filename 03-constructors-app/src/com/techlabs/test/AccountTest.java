package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Account;
import com.techlabs.model.AccountType;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
//		Account account1 = new Account(101, AccountType.Savings, "Suyash", 10000);
//		System.out.println(account1);
		
		Account accounts[]=new Account[5];
		
		for(int i=0;i<accounts.length;i++) {
			accounts[i]=new Account(101,AccountType.Savings,"Suyash",1000);
			System.out.println("Enter Account number:");
			accounts[i].setAccountNumber(scanner.nextInt());
			System.out.println("Enter Account Holder Name:");
			accounts[i].setName(scanner.next());
			System.out.println("Enter Account Balance:");
			accounts[i].setBalance(scanner.nextDouble());
			System.out.println("Enter Account Type: For savings, Press 1 ; and for current, Press 2");
			int accountType = scanner.nextInt();
			if(accountType==1) 
				accounts[i].setAccountType(AccountType.Savings);
			if(accountType==2)
				accounts[i].setAccountType(AccountType.Current);
		}
		
		for(int i=0;i<accounts.length;i++) {
			System.out.println(accounts[i]);
			System.out.println("");
		}
		
		scanner.close();
	}

}
