package com.experion.bp;

import java.util.Scanner;

public class VowelValidation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char inputChar;
		
		System.out.println("Enter vowel -");
		inputChar=scanner.next().charAt(0);
		
		switch(inputChar)
		{
		case 'a' : System.out.println("It is a vowel");
		           break;
		case 'e' : System.out.println("It is a vowel");
                   break;
		case 'i' : System.out.println("It is a vowel");
                   break;
		case 'o' : System.out.println("It is a vowel");
                   break;
		case 'u' : System.out.println("It is a vowel");
                   break;
        case 'A' : System.out.println("It is a vowel");
                   break;
        case 'E' : System.out.println("It is a vowel");
                   break;
        case 'I' : System.out.println("It is a vowel");
                   break;           
        case 'O' : System.out.println("It is a vowel");
                   break;
        case 'U' : System.out.println("It is a vowel");
                   break;     
        default :    System.out.println("It is note a vowel");        
		}

	}

}
