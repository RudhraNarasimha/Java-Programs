package com.datatypes.practice;

import java.util.Scanner;

public class MegaPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Your Number : ");

		int a = scanner.nextInt();

		int mega = 0;
		int number = 0;

		for (int i = 1; i <= a; i++) {

			mega = a % 10; // Last Digit

			int rem = a / 10; // remaining Digits

			if (a % a == 0 & a % 1 == 0) {

				number += mega;
			}

			else {

				break;

			}

			if (number == a) {
				System.out.println("Given Nuber is Mega Prime Number");
			}

			else {
				System.out.println("Given Number is not Mega Prime Number");
			}
		}
	}

}
