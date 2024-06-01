package com.techlabs.first;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte number1=7, number2=8;
		byte multiplication=(byte)(number1*number2);
		System.out.println(multiplication);
		
		int number3=100;
		double number4=number3; //implicit
		System.out.println(number4);
		
		int number5=(int)number4; //explicit
		System.out.println(number5);
		
		float number6=10.5f;
		System.out.println(number6);
		
//		boolean flag=true;
//		byte number7=(byte)flag;
//		System.out.println(number7);
	}

}
