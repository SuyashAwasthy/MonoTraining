package com.techlabs.lsp.violation;

public class Labour implements IWorker{

	@Override
	public void startWork() {
		
		System.out.println("Labour work started");
		
	}

	@Override
	public void stopWork() {
		
		System.out.println("Labour work stopped");
		
	}

	@Override
	public void eat() {
		
		System.out.println("Labour eating");
		
	}

	@Override
	public void drink() {
		
		System.out.println("Labour drinking");
		
	}

	
	
}
