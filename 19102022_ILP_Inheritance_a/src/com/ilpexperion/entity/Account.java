package com.ilpexperion.entity;

public class Account extends Product {
	
	private String accountType;

	public Account(String productCode, String productName, String productType, String accountType) {
		super(productCode, productName, productType);
		this.accountType = accountType;
	}

}