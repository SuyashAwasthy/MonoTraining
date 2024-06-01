package com.techlabs.model;

import java.util.Scanner;

public class InputValidator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String username, password, email;
		
		System.out.println("Enter username: ");
		username = scanner.next();
		checkUsername(username);
		
		System.out.println("Enter password: ");
		password = scanner.next();
		checkPassword(password);
		
		System.out.println("Enter email: ");
		email = scanner.next();
		checkEmail(email);
		
		scanner.close();
	}
	
	private static boolean validateInput(String input, int minLength, int maxLength) {
		
		if(input==null || input.length()<minLength || input.length()>maxLength)
			return false;
		
		return true;
		
	}
	
	private static void checkEmail(String email) {
		
		if(!validateInput(email,5,50)) {
			System.out.println("Invalid email.");
			return; 
		}
		
		int check = 0;
		
		for(int i=0;i<email.length();i++) {
			
			if(email.charAt(i)=='@')
				check++;
			
			if(email.charAt(i)=='.')
				check++;
			
		}
		
		if(check == 2) {
			System.out.println("Valid email.");
			return;
		}
		
		System.out.println("Invalid email.");

	}

	private static void checkPassword(String password) {
		
		if(!validateInput(password,8,30)) {
			System.out.println("Invalid password.");
			return; 
		}
		
		System.out.println("Valid password.");
		
	}

	private static void checkUsername(String username) {
		
		if(!validateInput(username,3,20)) {
			System.out.println("Invalid username.");
			return; 
		}
		
		System.out.println("Valid username.");
		
	}

}
