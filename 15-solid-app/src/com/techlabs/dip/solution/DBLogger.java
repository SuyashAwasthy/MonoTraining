package com.techlabs.dip.solution;

public class DBLogger implements ILogger{

	@Override
	public void log(String err) {
		System.out.println("Database logged");
	}

}
