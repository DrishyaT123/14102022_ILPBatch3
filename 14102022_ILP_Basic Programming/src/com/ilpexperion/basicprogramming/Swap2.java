package com.ilpexperion.basicprogramming;
import java.util.Scanner;

public class Swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			Scanner scanner = new Scanner(System.in);
			
			int n1;
			int n2;
			System.out.println("Enter n1");
			n1=scanner.nextInt();
			System.out.println("Enter n2");
			n2=scanner.nextInt();
			
			System.out.println("before swapping\n n1="+n1);
			System.out.println("before swapping\n n2="+n2);
			n1 = n1 + n2;
			n2 = n1 - n2;
			n1=  n1 -  n2;
			
			System.out.println("after swapping\n n1="+n1);
			System.out.println("after swapping\n n2="+n2);
			
			
		


	}

}