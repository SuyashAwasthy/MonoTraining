package com.techlabs.structural.model;

public class Chocolate implements IItems{

	private String name;
	private double mrp;
	
	@Override
	public String getItemName() {
		return name;
	}
	
	@Override
	public double getItemPrice() {
		return mrp;
	}

	public Chocolate(String name, double mrp) {
		super();
		this.name = name;
		this.mrp = mrp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMrp() {
		return mrp;
	}

	public void setMrp(double mrp) {
		this.mrp = mrp;
	}
	
}
