package com.bank.entity;

import java.util.ArrayList;

public class Customer {

	private String customerName;
	private String customerId;
	public Customer(String customerName, String customerId) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	
}
