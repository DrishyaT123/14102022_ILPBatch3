package com.ilpexperion.entity;

public class Card extends Product {
	
	private String cardType;

	public Card(String productCode, String productName, String productType, String cardType) {
		super(productCode, productName, productType);
		this.cardType = cardType;
	}

}
