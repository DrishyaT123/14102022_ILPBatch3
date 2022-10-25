package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n1;
		System.out.println("Enter n1");
		n1=scanner.nextInt();
		
		n1 = n1%10;
		
		if(n1==0)
		{
			System.out.println("The number is zero");
		}
		
		else if((n1%2) != 0)
		{
			System.out.println("odd");
		}
		else
		{
			System.out.println("Even");
		}
			

	}

}
