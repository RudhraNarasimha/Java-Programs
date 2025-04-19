package com.operators;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Age :");

		int age = scanner.nextInt();

		String status = age >= 18 ? "Eligible to Vote" : "Not Eligible to Vote";

		System.out.println(status);

	}

}





