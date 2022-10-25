package com.ilpexperion.service;

import java.util.ArrayList;

import com.ilpexperion.entity.Account;
import com.ilpexperion.entity.BankServices;
import com.ilpexperion.entity.Card;
import com.ilpexperion.entity.Product;

public class Service {

	
	public static Product createProduct(String productType) {	//returns a product object
		
		
		ArrayList<BankServices> bankServicesList=new ArrayList<BankServices>();
		bankServicesList.add(new BankServices("SOB","Online Banking") );
		bankServicesList.add(new BankServices("SOB","Mobile Banking") );
		bankServicesList.add(new BankServices("SOB","Cash Deposit") );
		//BankServices bankServices = new BankServices("S0B100","Online Banking");
		BankServices cardbankServices = new BankServices("S0B100","Generate pin");
		Product product = null;
		if(productType.compareTo("Cards")==0)
		{
			//Card card = new Card("MC100","Master Card","Cards","Master");
			product = new Card("MC100","Master Card","Cards","Master",cardbankServices); //goes to card constructor
		}
		else if(productType.compareTo("Accounts")==0)
		{
			product = new Account("HDFC100","Woman Savings Account","Accounts","Savings",bankServicesList); //goes to account constructor
		}
		return product;
	}


	public static void buyProduct() {
		// TODO Auto-generated method stub
		
	}


	public static void displayProduct(ArrayList<Product> productList) {
		Card card = null;
		Account account = null;
		System.out.println("Product Code"+"Product Nmae"+"Product Type");
		for(Product product : productList)
		{
		
			if(product instanceof Card) {
		
		       card = (Card)product;
		       System.out.println(card.getProductCode()+card.getProductName()+card.getProductType()+card.getCardType()+card.getCardbankServices().getServiceName());
			}
		   else if   (product instanceof Account) {
			   
			   account = (Account)product;
			   System.out.println("The list of srvices are given below");
			   System.out.println(account.getProductCode()+account.getProductName()+account.getProductType()
		       +account.getProductType()+account.getBankServices()); //return obj bankservices using bank service
			   for(BankServices bankServices : account.getBankServices()) {
				   System.out.println(bankServices.getServiceCode());
			   }
		       
		       
		       
		   }
			   
			   
	}

}}
