package com.techlabs.creational.factory.model;

public class MahindraFactory implements ICarFactory{

	@Override
	public ICar makeCar() {
		return new Mahindra();
		
	}

}
