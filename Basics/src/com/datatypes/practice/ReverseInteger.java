package com.datatypes.practice;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {

//		Write a Java program to reverse an integer number using arithmetic operators.
//		For example, input 1234 → output should be 4321.

		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		// Input from user
		System.out.print("Enter an integer: ");
		int number = scanner.nextInt();// 1234	
		int originalNumber = number;// 1234
		int reversed = 0;

		// Logic to reverse the number
		while (number > 0) {// 123
			int remainder = number % 10; // 4 3 2 // Get last digit
			reversed = reversed * 10 + remainder; // Shift digits and add
			number = number / 10; // 123 12 // Remove last digit
		}

		// Output result
		System.out.println("Reversed of " + originalNumber + " is: " + reversed);

		scanner.close();
	}
}
