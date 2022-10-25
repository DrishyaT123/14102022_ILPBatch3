package com.bank.utility;

import java.util.ArrayList;

import com.bank.entity.Customer;
import com.bank.entity.Product;
import com.bank.entity.Service;
import com.bank.service.BankService;


public class BankUtility {

	public static void main(String[] args) {
		
		ArrayList<Product> productList = new ArrayList<Product>(); //Creating product list to store products
		ArrayList<Service> allServicesList = new ArrayList<Service>(); //Creating service list to store services
		ArrayList<Customer> CustomerList= new ArrayList<Customer>(); //Creating customer list to store customers
		
		
		allServicesList=BankService.createServices(); //services created and stored to list
		productList = BankService.createProducts(allServicesList); //products created and stored to list
		for(Product product : productList)
		{
			System.out.println(product.getProductName());
			for(Service service : product.getServiceList())
			{
				System.out.println(service.getServiceName());
			}

	}
		do {
			System.out.println("****Welcome to Bank*****");
			System.out.println("1.Create Account\n2.Manage Accounts\n3.Display Accounts\n4.Exit");
			System.out.println("Enter your choice");
			AccountService accountService = new AccountService();
			int serviceChoice=scanner.nextInt();
			switch(serviceChoice) {
			case 1 : customers=accountService.createAccount(customers);
				break;
			case 2 : accountService.manageAccount(customers);
				break;
			case 3: System.out.println("Enter customer code");
				scanner.nextLine();
				String customerCode = scanner.nextLine();
				accountService.displayAccount(customers, customerCode);
				break;
			case 4: System.exit(0);
			default : System.out.println("Invalid Choice");
			}
			System.out.println("Do you want to continue in the program? (y/n)");
			mainChoice=scanner.next().charAt(0);
		}while(mainChoice =='y');
		

	}}
