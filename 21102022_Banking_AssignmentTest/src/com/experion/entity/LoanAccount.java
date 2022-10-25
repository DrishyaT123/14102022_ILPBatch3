package com.experion.entity;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.service.LoanService;

public class LoanAccount extends Account implements LoanService{

	
	

	public LoanAccount(String accountCode, String accountType, double accountBalance,
			ArrayList<BankServices> bankservices) {
		super(accountCode, accountType, accountBalance, bankservices);
		// TODO Auto-generated constructor stub
	}
	Scanner scanner = new Scanner(System.in);


	@Override
	public Account chequeDeposit(Account account) {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount on the cheque");
		double chequeDeposit=scanner.nextDouble();
		account.setAccountBalance(account.getAccountBalance()+chequeDeposit);
		return account;
		
	}

	@Override
	public Account cashDeposit(Account account) {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount to be deposited");
		double cashDeposit=scanner.nextDouble();
		account.setAccountBalance(account.getAccountBalance()+cashDeposit);
		
		return account;
	}

}
