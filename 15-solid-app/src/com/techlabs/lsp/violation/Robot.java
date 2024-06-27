package com.techlabs.lsp.violation;

public class Robot implements IWorker{

	@Override
	public void startWork() {
		
		System.out.println("Robot work started");
		
	}

	@Override
	public void stopWork() {
		
		System.out.println("Robot work stopped");
		
	}

	@Override
	public void eat() {
		
		System.out.println("Robot eating");
		
	}

	@Override
	public void drink() {
		
		System.out.println("Robot drinking");
		
	}

	
	
}
