package com.techlabs.creational.factory.model;

public class MarutiFactory implements ICarFactory{

	@Override
	public Maruti makeCar() {
		return new Maruti();
		
	}

}
