package com.ilpexperion.entity;

import java.util.ArrayList;

public class CurrentAccount extends Product implements SavingsCurrentAccService {
	
	private String cardNumber;
	private double cardBalance;
	
	public CurrentAccount(String productName, String cardNumber, double cardBalance) {
		super(productName);
		this.cardNumber = cardNumber;
		this.cardBalance = cardBalance;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public double getCardBalance() {
		return cardBalance;
	}
	public void setCardBalance(double cardBalance) {
		this.cardBalance = cardBalance;
	}
	@Override
	public void checkProductValidity() {
		System.out.println("Validity check of card class called");
		
	}

	@Override
	public void checkBalance() {
		System.out.println("Validity check Balance class called");
		
	}
	@Override
	public void cashWithdraw() {
		System.out.println("Validity cash withdraw class called");
		
	}
	
	
	
		
	}
