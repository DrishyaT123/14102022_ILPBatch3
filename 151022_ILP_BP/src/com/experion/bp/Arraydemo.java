package com.experion.bp;

import java.util.Scanner;

public class Arraydemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a[]=new String[5];
		System.out.println("enter 5 productname");
		a[0]=scanner.nextLine(); 
		
		
//		a[1]=scanner.nextLine();
//		a[2]=scanner.nextLine();
//		a[3]=scanner.nextLine(); 
//		a[4]=scanner.nextLine();
//		
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[4]);
		
		for(int i=0;i<5;i++) 
			a[i]=scanner.nextLine();
		for(int i=0;i<5;i++)
			System.out.println(a[i]);  


	}

}
