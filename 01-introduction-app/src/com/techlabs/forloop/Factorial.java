package com.techlabs.forloop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any single digit number: ");
		int num = scanner.nextInt();
		System.out.print("Factorial of "+num+" = ");
		int factorial = 1;
		for(int i=num;i>=1;i--)
			factorial *= i;
		System.out.print(factorial);
		scanner.close();
	}

}
