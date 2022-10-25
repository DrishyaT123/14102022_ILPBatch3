package com.ilpexperion.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilpexperion.entity.Customer;
import com.ilpexperion.service.AccountServices;
import com.ilpexperion.service.CurrentAccountService;



public class BankingUtility {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();  //list 
		int mainChoice;
		char choice;
		int customerid=0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("*****************Welcome*****************");
			System.out.println("1.Create Accounts 2.manage account 3.exit");
			System.out.println("Enter your choice :");
			mainChoice = scanner.nextInt();
			switch(mainChoice) {
				
	
			case 1 : customerList.add(AccountServices.createAccount(mainChoice));
			 break;
			case 2:
				System.out.println("****Accounts Available*********** 1. Display");
				//accountService.displayAccount(customers, customerCode);
				
			}
			System.out.println("Do you want to continue(Y/N):");
			choice=scanner.next().charAt(0);
		}while(choice=='y');

}
}