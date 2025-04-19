package com.datatypes.practice;


// Write a Java program that prompts the user to enter a bill amount, calculates a 10% discount on the bill, and then displays both the discounted bill amount as a double and the net bill amount as an integer. The program should use explicit type casting to convert the discounted bill amount to an integer.


public class BillAmount {

	float discount = 0.10f;
	
	
	int amount;
	
	
	int netb;
	
	int disa;

	
	void discouted() {
		
		
		double netb = amount * 0.10;
		double disa = amount - netb;
		int bill = (int) disa;
		
		
		System.out.println("Discount is :" +netb);
		System.out.println("Total Amount is : "+amount);
		System.out.println("Net balance is : "+bill);
		
		
	
	}

}
