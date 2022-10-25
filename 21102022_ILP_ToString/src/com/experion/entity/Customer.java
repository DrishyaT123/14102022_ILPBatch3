package com.experion.entity;

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

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", getCustomerName()="
				+ getCustomerName() + ", getCustomerId()=" + getCustomerId() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
