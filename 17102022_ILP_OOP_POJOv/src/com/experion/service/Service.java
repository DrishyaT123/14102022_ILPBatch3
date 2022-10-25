package com.experion.service;

import java.util.Scanner;

import com.experion.entity.Product;


public class Service {
	Product product = new Product();
	
		
	public void inputProductDetails() {
		
		
		 try (Scanner scanner = new Scanner(System.in);) {
			 
			
				System.out.println("Enter the product code -");
				String productCode = scanner.nextLine();
				product.setProductCode(productCode);
			
				System.out.println("Enter the product Name -");
				String productName = scanner.nextLine();
				product.setProductName(productName);
				
				System.out.println("Enter the product Description -");
				String productDescription = scanner.nextLine();
				product.setProductDescription(productDescription);
				
				System.out.println("Enter the product Price -");
				double productPrice = scanner.nextInt();
				product.setProductPrice(productPrice);
				
			scanner.nextLine();
			    System.out.println("Enter the product open date -");
			    String openDate = scanner.nextLine();
			    product.setOpenDate(openDate);
			
		       System.out.println("Enter the product validity date -");
		       String validityDate = scanner.nextLine();		
		       product.setValidityDate(validityDate);
			
		       System.out.println("Enter the product expiry date -");
		       String expiryDate= scanner.nextLine();		
		       product.setExpiryDate(expiryDate);
		       
	           System.out.println("Active (true or false) - ");
	           boolean active = scanner.nextBoolean();		
	        //   product.isActive(active);



			}}

			public void displayProductDetails() {

			System.out.println("Product Code is " + product.getProductCode());
			}
		


}
