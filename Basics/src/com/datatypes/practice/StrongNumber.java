package com.datatypes.practice;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in); //

		System.out.println("Enter Any Number");

		int number = scanner.nextInt();

		int sum = 0;

		while (number > 0) {

			int rem = number % 10; // Last Digit
			
			sum = sum + Factorial.getfact(rem); 
			
			number = number / 10;  // remaining Digits
		}

		System.out.println(sum);

	}

}
