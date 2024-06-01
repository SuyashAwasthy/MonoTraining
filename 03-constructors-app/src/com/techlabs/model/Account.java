package com.techlabs.model;

public class Account {
	private long accountNumber;
	private AccountType accountType;
	private String name;
	private double balance;
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account(long accountNumber, AccountType accountType, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountType=" + accountType + ", name=" + name
				+ ", balance=" + balance + ", getAccountNumber()=" + getAccountNumber() + ", getAccountType()="
				+ getAccountType() + ", getName()=" + getName() + ", getBalance()=" + getBalance() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
