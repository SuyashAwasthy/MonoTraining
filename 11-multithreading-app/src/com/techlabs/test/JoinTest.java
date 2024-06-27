package com.techlabs.test;

import com.techlabs.model.NewThread;

public class JoinTest {

	public static void main(String[] args) throws InterruptedException {
		
		NewThread thread1 = new NewThread("T1");
		NewThread thread2 = new NewThread("T2");
		NewThread thread3 = new NewThread("T3");
		
		System.out.println(thread1.thread.isAlive());
		System.out.println(thread1.thread.isAlive());
		System.out.println(thread1.thread.isAlive());

		for(int i=3;i>0;i--) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
		
		thread1.thread.join();
		
		System.out.println(thread1.thread.isAlive());
		System.out.println(thread1.thread.isAlive());
		System.out.println(thread1.thread.isAlive());
		
	}

}
