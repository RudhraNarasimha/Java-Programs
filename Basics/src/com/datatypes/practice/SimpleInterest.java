package com.datatypes.practice;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long p = 100000;
		float ir = 0.125f;
		int t = 10;

		double si = (p * ir * t) / 100;
		
		System.out.println("The Priniciple Amount is : " + p);
		System.out.println("Interest Rate is : 12.5 % ");
		System.out.println("Tenure : " + t);
		System.out.println("Simple Interest is : " + si);

	}

}
