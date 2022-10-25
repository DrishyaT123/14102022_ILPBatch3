package com.ilpexperion.utility;
import java.util.Scanner;

import com.ilpexperion.entity.SavingsMaxAccount;
import com.ilpexperion.entity.CurrentAccount;
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
			product = new SavingsMaxAccount("Womens saving Account","ACC123456",10000);
			SavingsMaxAccount account = (SavingsMaxAccount)product;
			account.cashWithdraw();
			account.checkBalance();
		}
		else if(choice == 2) {
			
			product = new CurrentAccount("Master card","ACC123456",10000);
			CurrentAccount card = (CurrentAccount)product;
			card.cashWithdraw();
			card.checkBalance();
		}
		
		else if(choice == 3) {
			
			product = new Loan("home loan","ACC123456",10000);
			Loan loan = (Loan)product;
			loan.checkDueDate();
			loan.loanApproval();
		}
		product.checkProductValidity();
		
}
}