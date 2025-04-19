package com.datatypes.practice;

public class Factorial {
	/*
	 * 1. Write a Java program to check if a number is a Strong Number. A strong
	 * number is one whose sum of factorials of digits is equal to the number. For
	 * example, 145 = 1! + 4! + 5! = 145
	 */

	public static int getfact(int number) {

		int fact = 1;

		for (int i = 1; i <= number; i++) {

			fact = fact * i;

		}

		return fact;
	}

}
