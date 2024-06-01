package com.techlabs.model;

public class StaticDemo {
	private static int number1;
	private int number2;
	
	public StaticDemo(){
		number1=0;
		number2=0;
	}
	
	public void display() {
		System.out.println("Number1: "+number1);
		System.out.println("Number2: "+number2);
	}
	
	public void increment() {
		number1++;
		number2++;
	}
	
	{
		System.out.println("non static block2");
	}
	
	static {
		System.out.println("Static block2");
	}
}
