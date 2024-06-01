package com.techlabs.assignments;

import java.util.Scanner;

public class IsSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input first string:");
		String string1 = scanner.nextLine();
		
		System.out.println("Input second string:");
		String string2 = scanner.nextLine();
		
		if(isSubstring(string1, string2))
			System.out.println("Yes, second string is a substring of the first string.");
		else
			System.out.println("No, second string is NOT a substring of the first string.");

		scanner.close();
	}
	
	private static boolean isSubstring(String string1, String string2) {
		int current = 0;
		for(int i=0;i<string1.length();i++) {
			if(string1.charAt(i) == string2.charAt(current)) {
				current++;
				if(current == string2.length()) {
					return true;
				}
			}
			else {
				i=i-current;
				current = 0;
			}
		}
		return false;
	}

}
