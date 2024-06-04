package com.techlabs.test;

import com.techlabs.model.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount savingAccount = new SavingAccount(0,"X",0,0);
		
		savingAccount.setAccountNumber(20);
		savingAccount.setName("A");
		savingAccount.setBalance(50);
		savingAccount.setMinimumBalance(100);
		
		System.out.println(savingAccount.getAccountNumber());
		System.out.println(savingAccount.getName());
		System.out.println(savingAccount.getBalance());
		System.out.println(savingAccount.getMinimumBalance());
	}

}
