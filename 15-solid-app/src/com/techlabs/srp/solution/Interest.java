package com.techlabs.srp.solution;

import com.techlabs.ocp.violation.FestivalType;

public class Interest {

	protected int accountNumber;
	protected String name;
	protected double principal;
	protected int duration;
	protected FestivalType festivalType;
	
	public Interest(int accountNumber, String name, double principal, int duration, FestivalType festivalType) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.festivalType = festivalType;
	}
	
	public FestivalType getFestivalType() {
		return festivalType;
	}

	public void setFestivalType(FestivalType festivalType) {
		this.festivalType = festivalType;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrincipal() {
		return principal;
	}
	
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
	
}
