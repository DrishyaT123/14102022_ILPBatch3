package com.ilpexperion.entity;

import java.util.ArrayList;

public class Account extends Product  {
	
	private String accountNumber;
	private double accountBalance;
	
	
	public Account(String productName, String accountNumber, double accountBalance) {
		super(productName);
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public void checkProductValidity() {
		
		System.out.println("Validity check of account class called");
	}
	
	
	
	}
