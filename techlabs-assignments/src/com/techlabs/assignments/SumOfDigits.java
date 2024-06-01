package com.techlabs.assignments;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		int num = scanner.nextInt();
		int copy = num;
		int sum=0, rem; 
        while (num > 0) { 
            rem = num % 10; 
            sum += rem;
            num = num / 10; 
        } 
        System.out.println("Sum of digits of "+copy+" = "+sum);
        scanner.close();
	}

}
