package com.techlabs.test;

import com.techlabs.model.Complex;

public class ComplexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex complex1 = new Complex(5,4);
		Complex complex2 = new Complex(3,2);
//		System.out.println("Enter real part of first number: ");
//		System.out.println("Enter imaginary part of first number: ");
//		System.out.println("Enter real part of second number: ");
//		System.out.println("Enter imaginary part of second number: ");

		Complex result = addition(complex1,complex2);
		
//		System.out.println(complex1.getReal());
//		System.out.println(complex2.getImaginary());
//		System.out.println(complex2.getSum());
		
		System.out.println("Addition: "+result.getReal()+" + "+result.getImaginary()+"i");
	}

	private static Complex addition(Complex complex1, Complex complex2) {
		
		Complex result = new Complex();
		result.setImaginary(complex1.getImaginary()+complex2.getImaginary());
		result.setReal(complex1.getReal()+complex2.getReal());
		return result;
	}

}
