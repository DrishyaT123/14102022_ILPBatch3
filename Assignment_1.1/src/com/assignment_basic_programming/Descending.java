package com.assignment_basic_programming;

import java.util.Scanner;

public class Descending {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numbers[] = new int[3];
		int tempNumber;
		System.out.println("enter 3 numbers -");
		for(int i=0;i<numbers.length;i++)
			numbers[i] = scanner.nextInt();
		for(int i=0;i<numbers.length;i++) {
			
			for(int j=i+1;j<numbers.length;j++) {
				if (numbers[i]<numbers[j]) {
					tempNumber = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tempNumber;
					
				}
			}
		}
		
		System.out.println("Numbers in descending order : ");
		for(int i=0; i<numbers.length;i++)
			System.out.println(numbers[i] + " ");
			

	}

}
