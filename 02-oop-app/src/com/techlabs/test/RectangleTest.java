package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle1 = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter details of a rectangle: ");
		System.out.println("Enter width: ");
		double width = scanner.nextDouble();
		System.out.println("Enter height: ");
		double height = scanner.nextDouble();
		
		rectangle1.setWidth(width);
		rectangle1.setHeight(height);
		
		System.out.println("Width: "+rectangle1.getWidth());
		System.out.println("Height: "+rectangle1.getHeight());
		System.out.println("Area: "+rectangle1.getArea());
		
//		rectangle1.initializeRectangle(width, height);
//		rectangle1.displayRectangle();
//		rectangle1.calculateArea();
		
		scanner.close();
	}

}
