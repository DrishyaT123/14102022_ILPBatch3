package com.ilpexperion.entity;

import com.ilpexperion.service.SavingsAcc_CurrAccService;

public class SavingsMaxAccount extends Account implements SavingsAcc_CurrAccService {
	
	private String accountNumber;
	private double accountBalance;
	public SavingsMaxAccount(String accountName, String accountNumber, double accountBalance) {
		super(accountName);
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
		System.out.println("Cash Deosit class called");
		
	}
	@Override
	public void atmWithdraw() {
		System.out.println("Atm withdraw class called");
		
	}
	@Override
	public void onlineBanking() {
		System.out.println("online banking class called");
		
	}
	
	
	

}
