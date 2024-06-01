package com.techlabs.model;

public class Complex {
	private double real;
	private double imaginary ;
	
	public Complex(){	//default 
		real = 0;
		imaginary = 0;
	}
	
	public Complex(double real, double imaginary) {	//parameterized
		this.real=real;
		this.imaginary=imaginary;
	}
	
//	public String Addition() {
//		this.real+=real;
//		this.imaginary+=imaginary;
//		return (this.real+" + "+this.imaginary);
//	}
	
	public void setReal(double real) {
		this.real=real;
	}
	
	public double getReal() {
		return real;
	}
	
	public void setImaginary(double imaginary) {
		this.imaginary=imaginary;
	}
	
	public double getImaginary() {
		return imaginary;
	}
	
	
	public String getSum() {
		return (this.real+" + "+this.imaginary+"i");
	}
}
