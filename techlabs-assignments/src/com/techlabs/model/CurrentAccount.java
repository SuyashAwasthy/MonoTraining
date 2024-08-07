package com.techlabs.model;

public class CurrentAccount extends Account{

	 private double overDraftLimit;

	    public CurrentAccount() {
	        super();
	    }

	    public CurrentAccount(long accountNumber, String accountName, double accountBalance, double overDraftLimit) {
	        super(accountNumber, accountName, accountBalance);
	        this.overDraftLimit = overDraftLimit;
	    }

	    public boolean validateOverDraft(int amount) {
	        if (amount > overDraftLimit + this.getAccountBalance()) {
	            System.out.println("Your account balance has exceeded the overdraft limit.");
	            return false;
	        }
	        if((this.getAccountBalance()-amount)<0) {
	        	System.out.println("Your available overdraft : "+(overDraftLimit+(this.getAccountBalance()-amount)));
	        }
	        debit(amount);
	        return true;
	    }
	
}
