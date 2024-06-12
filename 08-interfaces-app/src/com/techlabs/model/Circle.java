package com.techlabs.model;

public class Circle implements Shape{

	public void display() {
		System.out.println("Circle");
	}
	
	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.display();
	//	System.out.println("Area of circle: "+(3.14*circle.a*circle.a));

	}

}
