package com.techlabs.creational.factory.model;

public class TataFactory implements ICarFactory{

	@Override
	public Tata makeCar() {
		return new Tata();
	}

}
