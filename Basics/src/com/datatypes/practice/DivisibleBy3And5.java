package com.datatypes.practice;

import java.util.Scanner;

public class DivisibleBy3And5 {

	public static void main(String[] args) {

// Write a Java program to check if a number is divisible by 3 and 5. By both 3 and 5, Only by 3, Only by 5, Not divisible by either.

		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Any Number");

		int div = scanner.nextInt();

		if (div % 3 == 0 && div % 5 == 0) {
			System.out.println("This Number is Divisible by Both 3 and 5");

		}

		else if (div % 3 == 0) {
			System.out.println("This Number is Divible by 3");
		}

		else if (div % 5 == 0) {
			System.out.println("This Number is Divisble By 5");

		}

		else {
			System.out.println("This Number is Not Divisble by Either 3 or 5");
		}

	}

}
