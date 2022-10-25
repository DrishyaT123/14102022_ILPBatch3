package com.ilpexperion.utility;
import java.util.Scanner;

import com.ilpexperion.entity.Account;
import com.ilpexperion.entity.Card;
import com.ilpexperion.entity.Loan;
import com.ilpexperion.entity.Product;
import com.ilpexperion.service.AccountService;

public class BankUtility {

	public static void main(String[] args) {

//		Account account = new Account("Womens saving Account","ACC123456",10000);
//		
//		AccountService accountService = new AccountService();
//		
//		accountService.depositCash(account,20000);
//		accountService.depositCash(account,0, "qwerty");
//		accountService.depositCash(account,"qwertg",1000);
//		
		Product product = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Account 2.Card 3.Loan");
		int choice = scanner.nextInt();
		if(choice == 1)
		{
			product = new Account("Womens saving Account","ACC123456",10000);
		}
		else if(choice == 2) {
			
			product = new Card("Master card","ACC123456",10000);
		}
		
		else if(choice == 3) {
			
			product = new Loan("home loan","ACC123456",10000);
		}
		product.checkProductValidity();
		
}
}