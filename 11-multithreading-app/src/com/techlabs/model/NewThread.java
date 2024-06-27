package com.techlabs.model;

public class NewThread extends Thread{

	public Thread thread;
	
	public NewThread(String name) {
		this.thread=new Thread(this,name);
		thread.start();
	}
	@Override
	public void run() {
		for(int i=3;i>0;i--) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}   
	
	
}
