package com.ilpexperion.objectclassbasics;

public class Employee {
	
	String employeeName = "Drishya T";
	int employeeAge = 22;
	char employeeGender = 'M';
	double employeeCgpa = 8.16;
	
	public void displayEmployeeDetails() {
		System.out.println("**********Welcome to ILP Program**************");
		System.out.println("Name" +"        "+"Age"+"     "+"Gender"+"   "+"CGPA");
		System.out.println(employeeName+"   "+employeeAge+"      "+employeeGender+"        "+employeeCgpa);
		

	}

}
