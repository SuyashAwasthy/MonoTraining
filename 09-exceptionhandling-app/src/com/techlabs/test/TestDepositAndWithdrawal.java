package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.exceptions.InsufficientFundsException;
import com.techlabs.exceptions.NegativeAmountException;
import com.techlabs.model.BankAccount;

//import com.techlabs.exceptions.InsufficientFundsException;
//import com.techlabs.exceptions.NegativeAmountException;
//import com.techlabs.model.BankAccount;

public class TestDepositAndWithdrawal {

	public static void main(String[] args) {
		
		 BankAccount account = new BankAccount("Suyash", 1, 1000);
	     Scanner scanner = new Scanner(System.in);
	     boolean exit = false;
	     while (!exit) {
	         System.out.println("Choose option : \n1. Deposit \n2. Withdraw \n3. Display \n4. Exit");
	         int option = scanner.nextInt();
	         switch (option) {
	             case 1:
	            	 System.out.println("You chose to deposit ");
	            	 System.out.println("Enter the amount :");
	                 double depositAmount = scanner.nextDouble();
	                 try {
	                     account.deposit(depositAmount);
	                 } 
	                 catch (NegativeAmountException e) {
	                     System.out.println("Error: " + e.getMessage());
	                 }
	                 break;
	             case 2:
	                 System.out.println("You chose to withdraw ");
	                 System.out.println("Enter the amount :");
	                 double withdrawAmount = scanner.nextDouble();
	                 try {
	                     account.withdraw(withdrawAmount);
	                 } 
	                 catch (InsufficientFundsException e) {
	                     System.out.println("Error: " + e.getMessage());
	                 } 
	                 catch (NegativeAmountException e) {
	                     System.out.println("Error: " + e.getMessage());
	                 }
	                 break;
	             case 3:
	                 System.out.println("Details of account : ");
	                 System.out.println("Account Holder Name : " + account.getAccountName());
	                 System.out.println("Account Number : " + account.getAccountNumber());
	                 System.out.println("Account Balance : " + account.getAccountBalance());
	                 break;
	             case 4:
	                 System.out.println("Thank you for visiting!");
	                 exit = true;
	                 break;
	         }
	     }
	     scanner.close();
	}
}
