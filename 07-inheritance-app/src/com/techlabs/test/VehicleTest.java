package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Car;

public class VehicleTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Car cars[]=new Car[5];
		
		for(int i=0;i<cars.length;i++) {
			cars[i]=new Car();
			System.out.println("Enter Company Name:");
			cars[i].setCompanyName(scanner.next());
			System.out.println("Enter mileage:");
			cars[i].setMileage(scanner.nextInt());
			System.out.println("Enter price:");
			cars[i].setPrice(scanner.nextInt());
		}
		
		int count = 1;
		
		for(int i=0;i<cars.length;i++) {
			System.out.println("Vehicle number: "+count);
			System.out.println("Company name: "+cars[i].getCompanyName());
			System.out.println("Mileage: "+cars[i].getMileage());
			System.out.println("Price: "+cars[i].getPrice());
		}
		
		scanner.close();
	}

}
