package com.techlabs.test;

public class Test {

	public static void main(String[] args) {

		try {
//		System.out.println("Enter first number: ");
//		int number1 = scanner.nextInt();
//		System.out.println("Enter second number: ");
//		int number2 = scanner.nextInt();
			
			int number1 = Integer.parseInt(args[0]);
			int number2 = Integer.parseInt(args[1]);
		
			double division = calculate(number1,number2);
			System.out.println(division);
		}
		catch(ArithmeticException e){
			System.out.println("You cannot divide by zero");
		}
		
	}

	private static double calculate(int number1, int number2) {
		double division=0;
		try {
			division=number1/number2;
			System.out.println(division);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero.");
		}
		
		return 0;
	}

}
