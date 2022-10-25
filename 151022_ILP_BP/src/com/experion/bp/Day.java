package com.experion.bp;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int day;
		
		
		
		System.out.println("Enter dayNumber-");
		day=scanner.nextInt();
		
		switch(day)
		{
		case 1 : System.out.println("monday");
		           break;
		case 2 : System.out.println("tuesday");
                   break;
		case 3 : System.out.println("wed");
                   break;
		case 4 : System.out.println("thurs");
                   break;
		case 5 : System.out.println(" fri");
                   break;
        case 6 : System.out.println("sat");
                   break;
        case 7 : System.out.println("sun");
                   break;
        default : System.out.println("invalid");        
	}

}}

