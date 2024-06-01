package com.techlabs.model;

public class Rectangle {
	private double width;
	private double height;
	private double area;
	
	public void setWidth(double width2) {
		width=width2;
	}
	
	public void setHeight(double height2) {
		height=height2;
	}
	
	public void setArea() {
		area = width*height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getArea() {
		area = width*height;
		return area;
	}
	
//	public void initializeRectangle(double width2, double height2) {
//		width=width2;
//		height=height2;
//	}
//	
//	public void displayRectangle() {
//		System.out.println("Width of rectangle : "+width);
//		System.out.println("Height of rectangle: "+height);
//	}
//	
//	public void calculateArea() {
//		System.out.println("Area of rectangle: "+(width*height));
//	}
}
