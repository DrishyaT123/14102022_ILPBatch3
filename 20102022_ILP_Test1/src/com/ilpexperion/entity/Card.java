package com.ilpexperion.entity;

public class Card extends Product {
	
	private String cardType;
	private BankServices cardbankServices;
	public Card(String productCode, String productName, String productType, String cardType,
			BankServices cardbankServices) {
		super(productCode, productName, productType);
		this.cardType = cardType;
		this.cardbankServices = cardbankServices;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public BankServices getCardbankServices() {
		return cardbankServices;
	}
	public void setCardbankServices(BankServices cardbankServices) {
		this.cardbankServices = cardbankServices;
	}
	
	
	
	}
	
	
	

