package com.ilpexperion.service;

import com.ilpexperion.entity.SavingsMaxAccount;

public class AccountService {
	
	public void depositCash(SavingsMaxAccount account, double amount)
	{
      System.out.println("over counter");
	
	}
	
	public void depositCash(SavingsMaxAccount account, String checkNumber, double amount)
	{

		 System.out.println("via check");
	}
	
	public void depositCash(SavingsMaxAccount account, double amount , String upiCode)
	{

		 System.out.println("online");
	}
}
