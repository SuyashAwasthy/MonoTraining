package com.techlabs.creational.factory.test;

import com.techlabs.creational.factory.model.CarFactory;
import com.techlabs.creational.factory.model.ICar;

public class FactoryTest {

	public static void main(String[] args) {
		
		ICar car;

		car=CarFactory.getCar("Maruti");
		car.start();
		car.stop();
		
		car = CarFactory.getCar("Mahindra");
		car.start();
		car.stop();
		
		car = CarFactory.getCar("Tata");
		car.start();
		car.stop();

	}

}
