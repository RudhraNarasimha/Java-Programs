package com.datatypes.practice;

import java.util.Scanner;

// Arm Strong

public class ArmStrongNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Any Number: ");

		int number = scanner.nextInt();
		int sum = 0;
		int sum1 = number;
		int count = 0;
// To Find No of Digits.
		while (number > 0) {
			number = number / 10;
			count++;
		}

		number = sum1;

		// To Calculate the Power and Sum of them.
		while (number != 0) { // 153

			int rem = number % 10; // 3 // last digit

			sum +=  Math.pow(rem, count);

			number = number / 10; // remaining digits.
		}

		if (sum == sum1) {
			System.out.println(sum1 + " is an ArmStrong Number");
		} else {
			System.out.println(sum1 + " is Not an ArmStrong Number");
		}
	}

}
