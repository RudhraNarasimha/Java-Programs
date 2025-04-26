package com.datatypes.practice;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Any Number:");
		int num = scanner.nextInt();
		int originalNum = num;

		int count = 0;
		int temp = num;

		// Count the number of digits
		while (temp > 0) {
			temp = temp / 10;
			count++;
		}

		int sum = 0;
		temp = num;

		// Sum of digits raised to the power of count
		while (temp > 0) {
			int rem = temp % 10;
			sum += Math.pow(rem, count); // correct way to do power
			temp = temp / 10;
		}

		// Check Armstrong condition
		if (sum == originalNum) {
			System.out.println("Given Number is an Armstrong Number");
		} else {
			System.out.println("Given Number is NOT an Armstrong Number");
		}
	}
}
