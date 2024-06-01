package com.techlabs.assignments;

import java.util.Scanner;

public class CheckPalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		int num = scanner.nextInt();
		int copy=num;
		int rev = 0;
        int rem; 
        while (num > 0) { 
            rem = num % 10; 
            rev = (rev * 10) + rem; 
            num = num / 10; 
        } 
        if(copy==rev)
        	System.out.println(copy+" is a palindrome number.");
        else System.out.println(copy+" is not a palindrome number.");
        scanner.close();
	}

}
