package com.techlabs.test;

public class InputValidatorTest {
	
	private static boolean validateInput(String input, int minLength, int maxLength) {
		
		if(input==null || input.length()<minLength || input.length()>maxLength)
			return false;
		
		return true;
		
	}
	
	public static void checkEmail(String email) {
		
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

	public static void checkPassword(String password) {
		
		if(!validateInput(password,8,30)) {
			System.out.println("Invalid password.");
			return; 
		}
		
		System.out.println("Valid password.");
		
	}

	public static void checkUsername(String username) {
		
		if(!validateInput(username,3,20)) {
			System.out.println("Invalid username.");
			return; 
		}
		
		System.out.println("Valid username.");
		
	}
}
