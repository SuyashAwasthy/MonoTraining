package com.techlabs.cla;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=Integer.parseInt(args[0]), num2=Integer.parseInt(args[1]);
		System.out.println("Before swapping:\nNum1 = "+num1+" Num2 = "+num2);
		int num3=num1;
		num1=num2;
		num2=num3;
		System.out.println("After swapping:\nNum1 = "+num1+" Num2 = "+num2);
	}

}
