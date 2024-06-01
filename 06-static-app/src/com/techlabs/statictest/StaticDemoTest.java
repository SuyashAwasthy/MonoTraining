package com.techlabs.statictest;

import com.techlabs.model.StaticDemo;

public class StaticDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo demo1 = new StaticDemo();
		StaticDemo demo2 = new StaticDemo();
		StaticDemo demo3 = new StaticDemo();
		demo1.display();
		demo2.display();
		demo3.display();
		
		demo1.increment();
		demo2.increment();
		demo3.increment();
		
		demo1.display();
		demo2.display();
		demo3.display();
	}
	
	{
		System.out.println("Non static block");
	}
	
	static {
		System.out.println("Static block");
	}

}
