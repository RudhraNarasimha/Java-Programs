package com.datatypes.practice;

import java.util.Scanner;

public class PayrollSystem {

	public static void main(String[] args) {

		// In a payroll system, write a ternary operator to calculate the bonus. If the
		// employee has completed more than 5 years of service, they get a 20% bonus on
		// their salary, otherwise, they get a 10% bonus.

		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Your year");

		int year = scanner.nextInt();

		System.out.println("Enter Your Salary");

		int salary = scanner.nextInt();

		double bonus = year > 5 ? salary + (salary * 0.20) : salary + (salary * 0.10);

		System.out.println("Your Bonus is : " + bonus);

	}

}
