package com.ilpexperion.utility;


import java.util.ArrayList;
import java.util.Scanner;

import com.ilpexperion.entity.Product;
import com.ilpexperion.service.Service;

public class ProductUtility {
	public static void main(String[] args) {
		
	}
		
		
	ArrayList<Product> productList = null;
	Scanner scanner = new Scanner(System.in);
	
	do {

	System.out.println("1. Add card product 2. Add account details 3.buy product");
	int choice = scanner.nextInt();
	switch(choice)
	{
	case 1 : productList.(addService.createCardProduct());
	         break;
	case 2 : Service.createAccountProduct();
             break; 
	case 3 : Service.buyProduct();
             break;      
   default : System.out.println("invalid choice")  ;        
	}
	System.out.println("Do u want to continue");
	mainChoice= scanner.next().CharAt(0);
	
}
}

	
		
