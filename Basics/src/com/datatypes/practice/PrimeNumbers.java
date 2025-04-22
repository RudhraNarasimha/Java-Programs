package com.datatypes.practice;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Number :");

		int a = scanner.nextInt();

		if (a % a == 0 || a % 1 == 0) {

			System.out.println("Given Number is Prime Number");

		} else {
			System.out.println("Given Number is not Prime Number");
		}
	}

}
