package com.experion.utility;

import com.experion.entity.Product;
import com.experion.service.Service;

import java.util.Scanner;

public class ProductUtility {

	public static void main(String[] args) {
		
		
		
		char mainChoice;
		int index = 0;
		Scanner scanner = new Scanner(System.in);
		product ProductList[] = new Product[3];
		do;
		{
			System.out.println("1. create product 2.Display product");
			int choice = Scanner.nextInt();
			switch(choice)
			{
			case 1  : ProdutList[Index] = Service.createProduct();
			          index++;
			          break;
			case 2  :Service.displayProductDetails(productList);          
			}
			
			System.out.println("Do you wanted to continue (y/n)");
			mainChoice=scanner.next().charAt(0);
			
			
		}
		
		while(mainChoice == 'y';)


	}

}
