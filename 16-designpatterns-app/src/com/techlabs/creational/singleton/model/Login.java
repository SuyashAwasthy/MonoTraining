package com.techlabs.creational.singleton.model;

public class Login {

	private static Login login = new Login();
	
	private Login() {
		
	}
	
	public static Login getLogin() {
		if(login==null)	//lazily
			login=new Login();
			
		return login;
	}
	
	public String getMessage() {
		return "Login successful";
	}
	
	
}
