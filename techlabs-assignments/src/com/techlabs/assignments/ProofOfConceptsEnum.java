package com.techlabs.assignments;

public class ProofOfConceptsEnum {

	enum Color {
        RED, GREEN, BLUE, YELLOW;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color var_1=Color.BLUE;
        switch(var_1){
        	case RED:
        		System.out.println("Red color observed");
        		break;
        	case GREEN:
        		System.out.println("Green color observed");
        		break;
        	case BLUE:
        		System.out.println("Blue color observed");
        		break;
        	default:
        		System.out.println("Other color observed");
        }
	}

}
