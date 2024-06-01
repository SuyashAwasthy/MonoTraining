package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Account account1 = new Account();
		
		System.out.println("Enter details of first account holder: ");
		System.out.println("Enter account number: ");
		long accountNumber = scanner.nextInt();
		System.out.println("Enter account type (savings/current): ");
		String accountType = scanner.next();
		System.out.println("Enter name: ");
		String name = scanner.next();
		System.out.println("Enter balance");
		double balance = scanner.nextInt();
		
		account1.setAccountNumber(accountNumber);
		account1.setAccountType(accountType);
		account1.setName(name);
		account1.setBalance(balance);
		
		System.out.println("Account Number: "+account1.getAccountNumber());
		System.out.println("Account Type: "+account1.getAccountType());
		System.out.println("Name: "+account1.getName());
		System.out.println("Balance: "+account1.getBalance());
		
//		account1.initializeAccount(accountNumber,accountType,name,age);
//		account1.displayAccount();
		
		Account account2 = new Account();
		
		System.out.println("\nEnter details of second account holder: ");
		System.out.println("Enter account number: ");
		accountNumber = scanner.nextInt();
		System.out.println("Enter account type (savings/current): ");
		accountType = scanner.next();
		System.out.println("Enter name: ");
		name = scanner.next();
		System.out.println("Enter balance");
		balance = scanner.nextInt();
		
		account2.setAccountNumber(accountNumber);
		account2.setAccountType(accountType);
		account2.setName(name);
		account2.setBalance(balance);
		
		System.out.println("Account Number: "+account2.getAccountNumber());
		System.out.println("Account Type: "+account2.getAccountType());
		System.out.println("Name: "+account2.getName());
		System.out.println("Balance: "+account2.getBalance());
		
//		account2.initializeAccount(accountNumber,accountType,name,age);
//		account2.displayAccount();
		
		scanner.close();
	}

}
