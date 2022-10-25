package com.ilpexperion.entity;

public abstract class Product {
	
	private String productId;
	
	

	public Product(String productId) {
		super();
		this.productId = productId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductName(String productId) {
		this.productId = productId;
	}
	
	public abstract void cashDeposit();
	
	

}
