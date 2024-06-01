package com.techlabs.test;

import com.techlabs.model.BoxWeight;

public class BoxWeightTest {

	public static void main(String[] args) {
	
		BoxWeight boxWeight = new BoxWeight();
		
		boxWeight.setDepth(20);
		boxWeight.setWidth(30);
		boxWeight.setHeight(50);
		boxWeight.setWeight(100);
		
		System.out.println(boxWeight.getDepth());
		System.out.println(boxWeight.getWidth());
		System.out.println(boxWeight.getHeight());
		System.out.println(boxWeight.getWeight());

	}

}
