package com.datatypes.practice;

import java.util.Scanner;

public class IncreasingReversePyrmid {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Any Number :");

		int a = scanner.nextInt();

		for (int i = 1; i <= a; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
