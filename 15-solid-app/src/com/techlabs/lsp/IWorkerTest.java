package com.techlabs.lsp;

import com.techlabs.lsp.violation.IWorker;
import com.techlabs.lsp.violation.Labour;
import com.techlabs.lsp.violation.Robot;

public class IWorkerTest {

	public static void main(String[] args) {
		
		IWorker labour = new Labour();
		labour.startWork();
		labour.drink();
		labour.eat();
		labour.stopWork();
		
		IWorker robot = new Robot();
		robot.startWork();
		robot.drink();
		robot.eat();
		robot.stopWork();
		
	}

}
