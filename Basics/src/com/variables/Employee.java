package com.variables;

public class Employee {
	int id;					// instance Variables is Declared inside the  Class and Before the Method.	
	String name;
	String dept;
	double salary;
   static String company = " Google";
	void getEmployeeDetails() {
		System.out.println(id+" "+name+" "+salary+" "+company); //  + means Concating the all variables.
	}
	
	
	
}

