package com.techlabs.model;

public class Account {
	private long accountNumber;
	private String accountType;
	private String name;
	private double balance;
	
	public void setAccountNumber(long accountNumber2) {
		accountNumber = accountNumber2;
	}
	
	public void setAccountType(String accountType2) {
		accountType = accountType2;
	}
	
	public void setName(String name2) {
		name = name2;
	}

	public void setBalance(double balance2) {
		balance = balance2;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountType() {
		return accountType;
	}
	
	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
	
//	public void initializeAccount(long accountNumber2, String accountType2,String name2, double balance2) {
//		accountNumber = accountNumber2;
//		accountType = accountType2;
//		name = name2;
//		balance = balance2;
//	}
//	
//	public void displayAccount() {
//		System.out.println("Account number: "+accountNumber);
//		System.out.println("Account type: "+accountType);
//		System.out.println("Name: "+name);
//		System.out.println("Balance: "+balance);
//	}
}
