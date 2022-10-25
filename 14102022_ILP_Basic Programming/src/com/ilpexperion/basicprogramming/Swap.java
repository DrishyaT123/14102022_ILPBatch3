package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n1;
		int n2;
		int n3;
		System.out.println("Enter n1");
		n1=scanner.nextInt();
		System.out.println("Enter n2");
		n2=scanner.nextInt();
		
		System.out.println("before swapping\n n1="+n1);
		System.out.println("before swapping\n n2="+n2);
		n3 = n1;
		n1 = n2;
		n2 = n3;
		
		System.out.println("after swapping\n n1="+
		n1);
		System.out.println("after swapping\n n2="+n2);
		
		
	}

}
