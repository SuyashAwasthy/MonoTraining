package com.techlabs.scanner;

import java.util.Scanner;

public class MaxOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = scanner.nextInt();
		System.out.println("Enter second number: ");
		int num2 = scanner.nextInt();
		if(num1>num2)
			System.out.println(num1+" is greater than "+num2);
		else if(num1<num2)
			System.out.println(num2+" is greater than "+num1);
		else 
			System.out.println("Both the numbers are equal");
		scanner.close();
	}

}
