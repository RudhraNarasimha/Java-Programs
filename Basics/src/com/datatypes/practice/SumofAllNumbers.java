package com.datatypes.practice;

import java.util.Scanner;


public class SumofAllNumbers {
	
//	5.Write a Java program to input a number N and find the sum of all  numbers from 1 to N.
//	Use loops and conditional statements.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;

//		// Write a Java program that accepts an integer and displays:
//		The total number of digits

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Integes");
		int num = scanner.nextInt();

		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}

		System.out.println(sum);

	}

}