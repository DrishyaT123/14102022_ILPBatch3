package com.ilpexperion.entity;

public abstract class Account {
	
private String accountName;
	
	

	public Account(String accountName) {
		super();
		this.accountName = accountName;
	}

	public String getProductName() {
		return accountName;
	}

	public void setProductName(String accountName) {
		this.accountName = accountName;
	}
	
	public abstract void cashDeposit();

}
