package com.datatypes.practice;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a Java program to check whether a given year is a leap year or not.

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Year");

		int year = scanner.nextInt();

		if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) {

			System.out.println("Leap Year : " + year);

		} else {

			System.out.println("Not A Leap Year : " + year);
		}

	}
}
