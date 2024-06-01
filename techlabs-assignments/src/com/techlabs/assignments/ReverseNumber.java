package com.techlabs.assignments;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		int num = scanner.nextInt();
		int rev = 0;
        int rem; 
        while (num > 0) { 
            rem = num % 10; 
            rev = (rev * 10) + rem; 
            num = num / 10; 
        } 
        System.out.println("Reverse of the number = "+rev);
        scanner.close();
	}

}
