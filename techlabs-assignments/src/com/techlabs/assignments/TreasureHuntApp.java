package com.techlabs.assignments;

import java.util.Scanner;

public class TreasureHuntApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("You want to go left or right? ");
		String dir = scan.nextLine();
		if(!dir.equals("left")) System.out.println("Fall into a hole.\nGame Over.");
		else{
			System.out.println("You want to swim or wait? ");
			String act = scan.nextLine();
			if(!act.equals("wait")) System.out.println("Attacked by trout.\nGame Over.");
			else {
				System.out.println("Which door? red, yellow or blue? ");
				String color = scan.nextLine();
				if(color.equals("red")) System.out.println("Burned by fire.\nGame Over.");
				else if(color.equals("yellow")) System.out.println("You Win!");
				else if(color.equals("blue")) System.out.println("Eaten by beasts.\nGame Over.");
				else System.out.println("Game Over.");
			}
		}
		scan.close();
	}

}
