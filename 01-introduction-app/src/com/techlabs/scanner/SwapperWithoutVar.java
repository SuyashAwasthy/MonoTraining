package com.techlabs.scanner;

import java.util.Scanner;

public class SwapperWithoutVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1=scanner.nextInt();
		System.out.println("Enter second number: ");
		int num2=scanner.nextInt();
		System.out.println("Before swapping:\nNum1 = "+num1+" Num2 = "+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("\nAfter swapping:\nNum1 = "+num1+" Num2 = "+num2);
		scanner.close();
	}

}
