package com.techlabs.creational.factory.model;

public class CurrentAccount implements IAccount{

	private int accountNumber;
    private double accountBalance;
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double accountBalance, double overdraftLimit) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.overdraftLimit = overdraftLimit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(int overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void credit(double amount) {
        this.accountBalance+=amount;

    }

    @Override
    public void debit(double amount) {
        if(this.accountBalance+this.overdraftLimit>=amount)
            this.accountBalance-=amount;
        System.out.println("Overdraft Limit reached");
    }

    @Override
    public void displayAccountDetails() {
        System.out.println();
        System.out.println("Account Number : "+getAccountNumber());
        System.out.println("Account Balance : "+getAccountBalance());
        System.out.println("Account overdraft limit : "+getOverdraftLimit());
        System.out.println();
    }

}
