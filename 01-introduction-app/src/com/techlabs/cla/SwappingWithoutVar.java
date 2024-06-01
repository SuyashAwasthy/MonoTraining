package com.techlabs.cla;

public class SwappingWithoutVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=Integer.parseInt(args[0]), num2=Integer.parseInt(args[1]);
		System.out.println("Before swapping:\nNum1 = "+num1+" Num2 = "+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After swapping:\nNum1 = "+num1+" Num2 = "+num2);
	}

}
