package com.techlabs.test;

import com.techlabs.model.Boy;
import com.techlabs.model.Man;

public class ManBoyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man man=new Man();
		man.eat();
		man.play();
		man.work();
		
		Boy boy = new Boy();
		boy.eat();
		boy.play();
		boy.work();
		boy.sleep();
		
		Man bigMan = new Boy();
		bigMan.eat();
		bigMan.play();
		bigMan.work();
	}

}
