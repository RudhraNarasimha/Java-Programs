package com.datatypes.practice;

import java.util.Scanner;

// 3. Write a Java program that accepts an integer and displays:
//The total number of digits

public class NumberCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;

		Long count = 0L;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Integes");
		long num = scanner.nextLong();

		scanner.close();

		while (num != 0) {//1

			int rem = (int) num % 10; // Type Conversion From Long to Int

			count++;
			num = num / 10;
		

		}

		System.out.println(count);

	}

}
