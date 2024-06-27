package com.techlabs.creational.factory.model;

public class SavingsAccount implements IAccount{

	private int accountNumber;
    private String accountName;
    private double accountBalance;

    public SavingsAccount(int accountNumber, String accountName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public void credit(double amount) {
        this.accountBalance+=amount;
    }

    @Override
    public void debit(double amount) {
        if(this.accountBalance>=amount)
            this.accountBalance-=amount;

        System.out.println("Insufficiant Balance");
    }

    @Override
    public void displayAccountDetails() {
        System.out.println();
        System.out.println("Account Holder Name : "+getAccountName());
        System.out.println("Account Number : "+getAccountNumber());
        System.out.println("Account Balance : "+getAccountBalance());
        System.out.println();
    }

}
