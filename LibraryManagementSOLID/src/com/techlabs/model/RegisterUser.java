package com.techlabs.model;

public class RegisterUser {
	private User user;

    public RegisterUser(User user) {
        this.user = user;
    }

    public void registerUser() {
        System.out.println("User Registered");
        System.out.println("User Name : " + user.getUserName() + " User Id : " + user.getUserId());
    }
}
