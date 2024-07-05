package com.techlabs.structural.model;

public class IndianHotel implements IHotel{

	@Override
	public IMenu getMenu() {
		return new IndianMenu();
	}

	
}
