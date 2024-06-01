package com.techlabs.debug;

public class AdditionDebug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10, num2=20;
		int sum=addition(num1,num2);
		double avg=average(sum);
		System.out.println(avg);
	}
	
	private static int addition(int num1, int num2) {
		return num1+num2;
	}
	
	private static double average(int sum) {
		return sum/2;
	}

}
