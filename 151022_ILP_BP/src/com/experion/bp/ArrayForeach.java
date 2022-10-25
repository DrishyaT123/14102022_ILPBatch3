package com.experion.bp;

import java.util.Scanner;

public class ArrayForeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String a[]=new String[5];
		System.out.println("enter 5 productname");
		
		for(int i=0;i<a.length;i++) {
			
			a[i]=scanner.nextLine();	}
		
		for(String oneProduct : a)
			System.out.println(oneProduct);  
			
	}

}
