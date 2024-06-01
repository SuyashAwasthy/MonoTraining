package com.techlabs.statictest;

import com.techlabs.model.Account;

public class AccountTest {

	public static void main(String[] args) {

		Account account1 = new Account(101,"AA",1000);
		account1.display();
		
		Account account2 = new Account(102,"BB",2000);
		account2.display();
		
		Account account3 = new Account(103,"CC",3000);
		account3.display();
	}

}
