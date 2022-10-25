package com.ilpexperion.entity;

public class LoanAccount extends Account {

	private String loanNumber;
	private double loanAmmount;
	public LoanAccount(String loanNumber, double loanAmmount) {
		super(loanNumber);
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
	public void cashDeposit() {
		System.out.println("Cash Deosit class called");
		
	}
	
	
}