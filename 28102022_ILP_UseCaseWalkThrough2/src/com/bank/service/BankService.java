package com.bank.service;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.bank.entity.Rate;
import com.bank.entity.Service;

public class BankService {
	
	public static Service createService() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the following details to create service");
		System.out.println("Service Code:-");
		String serviceCode = scanner.nextLine();
		
		System.out.println("Service Name:-");
		String serviceName = scanner.nextLine();
		
		System.out.println("Service Description:-");
		String serviceDescription = scanner.nextLine();
		
		System.out.println("open date:-");
		String openDate = scanner.nextLine();
		
		System.out.println("validity date:-");
		String validityDate = scanner.nextLine();
		
		System.out.println("expiry date:-");
		String expiryDate = scanner.nextLine();
		
		Date openDateConverted = stringToDate(openDate);
		Date validityDateConverted = stringToDate(validityDate);
		Date expiryDateConverted = stringToDate(expiryDate);
		
		
		Service service = new Service(serviceCode,serviceName,serviceDescription,openDateConverted,validityDateConverted,expiryDateConverted);
		return service;
}
	public static void createRateCard(Service service) {

		Scanner scanner = new Scanner(System.in);
		Rate rate = new Rate();
		
		
		
		System.out.println("**************Enter the rate card for " + service.getServiceName()+ " ************");
		System.out.println("Enter the number of tiers you want to add");
		int noOfTiers = scanner.nextInt();
		int[] min=new int[noOfTiers];
		int[] max=new int[noOfTiers];
		double[] fees=new double[noOfTiers];
		
		for(int tier=0;tier<noOfTiers;tier++) {
			
			System.out.println("Enter the MIN    MAX  and Rate for the"+(tier+1)+"tier");
			min[tier]=scanner.nextInt();
			max[tier]=scanner.nextInt();
			fees[tier]=scanner.nextDouble();
			System.out.println("Successfully inserted values in the"+(tier+1)+"tier");
			if(tier<noOfTiers)
			{
			System.out.println("do you add more tiers-(y/n)");
			char ch=scanner.next().charAt(0);
			if(ch=='y')
				continue;
			else
				break;
		}
		
	
		
		service.setRate(rate);
		service.getRate().setMin(min);
		service.getRate().setMax(max);
		service.getRate().setRate(fees);
		System.out.println("Successfully created rate card for service"+service.getServiceName());
		
	}}
	public static void displayServiceDetails(Service service) {
		System.out.println("***********Service Details**************");
		System.out.println("Service code"+"  "+"Service name"+"     "+"Service Description"+"     "+"open Date"+"    "+"validity date"+"   "+"expiry date");
		System.out.println(service.getServiceCode()+"    "+service.getServiceName()+"   "+service.getServiceDesc()+"    "+service.getOpenDate()+"   "+service.getValidityDate()+"    "+service.getExpiryDate());
		
		System.out.println("rate card for the service"+service.getServiceName()+"is given below");
		System.out.println("MIN MAX RATE");
		for(int index=0; index<service.getRate().getMin().length;index++) {
			if((service.getRate().getMax() [index]<=999999) && (service.getRate().getMax() [index]!=0)) {
				
				System.out.println(service.getRate().getMin()[index]+"        "+service.getRate().getMax()[index]+"      "+service.getRate().getRate()[index]);
			}
			
			
		}
		
		
		
		System.out.println(service);
		System.out.println(service.getRate());
		
	}
	public static Date stringToDate(String dateString) {
		
		
		
		Date convertedDate = null;
		try {
			convertedDate = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
		} catch (ParseException e) {
			
			e.printStackTrace();
		} 
		return convertedDate;
		
		
	}
	
}