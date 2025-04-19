package com.datatypes.practice;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of Lines:");
		int lines = scanner.nextInt();

		for (int line = lines; line <= lines; line++) {

			// Print spaces

			for (int space = lines; space <= lines; space++) {

				// Print stars
				for (int star = line; star <= line; star++) {
					System.out.print("* ");
				}
				System.out.println(); // Move to next line
			}
		}

		scanner.close();
	}
}
