package com.techlabs.structural.model;

public class ItalianHotel implements IHotel{

	@Override
	public IMenu getMenu() {
		return new ItalianMenu();
	}

}
