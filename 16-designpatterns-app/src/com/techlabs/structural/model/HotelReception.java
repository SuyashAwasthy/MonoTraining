package com.techlabs.structural.model;

public class HotelReception {

	void getIndianMenu() {
		IHotel indianHotel = new IndianHotel();
		IMenu menu = indianHotel.getMenu();
		menu.displayMenu();
		
	}
	
	void getItalianMenu() {
		IHotel italianHotel = new ItalianHotel();
		IMenu menu = italianHotel.getMenu();
		menu.displayMenu();
	}
	
}
