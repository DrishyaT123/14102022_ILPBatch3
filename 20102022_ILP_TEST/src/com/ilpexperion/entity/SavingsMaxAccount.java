package com.ilpexperion.entity;

import java.util.ArrayList;

public class SavingsMaxAccount extends Product implements SavingsCurrentAccService  {
	
	private String accountNumber;
	private double accountBalance;
	
	
	public SavingsMaxAccount(String productName, String accountNumber, double accountBalance) {
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
	public void cashDeposit() {
		
		System.out.println("Cash Deposit class called");
	}
	@Override
	public void checkBalance() {
		System.out.println("Validity check balance class called");
		
	}
	@Override
	public void cashWithdraw() {
		System.out.println("Validity cash withdraw class called");
		
	}
	
	
	
	}
