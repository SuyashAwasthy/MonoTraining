package com.techlabs.test;

import com.techlabs.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Rectangle rectangle1 = new Rectangle();
		Rectangle rectangle2 = new Rectangle(10,20);
		Rectangle rectangle3 = new Rectangle(15);
		System.out.println(rectangle2.getHeight());
		System.out.println(rectangle3.getHeight());
	}
}
