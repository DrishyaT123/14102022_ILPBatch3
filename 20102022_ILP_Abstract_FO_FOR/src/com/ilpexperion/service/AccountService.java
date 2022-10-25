package com.ilpexperion.service;

import com.ilpexperion.entity.Account;

public class AccountService {
	
	public void depositCash(Account account, double amount)
	{
      System.out.println("over counter");
	
	}
	
	public void depositCash(Account account, String checkNumber, double amount)
	{

		 System.out.println("via check");
	}
	
	public void depositCash(Account account, double amount , String upiCode)
	{

		 System.out.println("online");
	}
}
