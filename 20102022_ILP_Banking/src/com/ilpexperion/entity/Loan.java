package com.ilpexperion.entity;

import java.util.ArrayList;

public class Loan extends Product implements LoanService {
	
	private String loanNumber;
	private double loanAmmount;
	public Loan(String productName, String loanNumber, double loanAmmount) {
		super(productName);
		this.loanNumber = loanNumber;
		this.loanAmmount = loanAmmount;
	}
	public String getLoanNumber() {
		return loanNumber;
	}
	public void setLoanNumber(String loanNumber) {
		this.loanNumber = loanNumber;
	}
	public double getLoanAmmount() {
		return loanAmmount;
	}
	public void setLoanAmmount(double loanAmmount) {
		this.loanAmmount = loanAmmount;
	}
	@Override
	public void checkProductValidity() {
		System.out.println("Validity check of loan class called");
		
	}
	@Override
	public void checkDueDate() {
		System.out.println("Validity check due date class called");
		
	}
	@Override
	public void loanApproval() {
		System.out.println("Validity check loan approval class called");
		
	}
	
	
	
	}
	
		

