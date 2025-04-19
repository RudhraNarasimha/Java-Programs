package com.datatypes.practice;

import java.util.Scanner;



//Greatest of Three Numbers using Ternary Operator 



public class BigNumber {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int a;
		int b;
		int c;
		String big;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Any Number: ");

		a = scanner.nextInt();

		System.out.println("Enter Any Number: ");

		b = scanner.nextInt();

		System.out.println("Enter Any Number: ");

		c = scanner.nextInt();

		big = (a > b) ? (a > c ? "A is Bigger" : "C is Bigger") : (b > c ? "B is Bigger" : "C is Bigger");

		System.out.println(big);

	}

}
