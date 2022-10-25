package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n1;
		int n2;
		int n3;
		
		System.out.println("Enter n1");
		n1=scanner.nextInt();
		System.out.println("Enter n2");
		n2=scanner.nextInt();
		System.out.println("Enter n3");
		n3=scanner.nextInt();
		
		if(n1>n2 && n1>n3)
		{
			if(n2>n3)
			{
				System.out.println("n2 is middlarge");
			}
			else
				System.out.println("n3 is middlarge");
		}
		
		else if(n2>n1 && n2>n3)
		{
			if(n3>n2)
			{
				System.out.println("n2 is middlarge");
			}
			else
				System.out.println("n3 is middlarge");
		}
		
		else if(n3>n1 && n3>n2)
		{
			if(n3>n2)
			{
				System.out.println("n2 is middlarge");
			}
			else
				System.out.println("n3 is middlarge");
		}
		
		

	}

}
