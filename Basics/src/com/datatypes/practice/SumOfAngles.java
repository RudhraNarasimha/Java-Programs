package com.datatypes.practice;

import java.util.Scanner;

public class SumOfAngles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a Java program to check whether the given angles form a valid triangle.
		// A triangle is valid if: The sum of angles is exactly 180 only.

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 Angle  of Your Triangle");
		double a = scanner.nextDouble();

		System.out.println("Enter 2 Angle  of Your Triangle");
		double b = scanner.nextDouble();
		System.out.println("Enter 3 Angle  of Your Triangle");
		double c = scanner.nextDouble();

		scanner.close();

		double angle = a + b + c;
		if (a>0 && b>0 && c>0){
			if (angle == 180) {
				System.out.println("The Sum of Angles is Exactly 180 ");
			}

			else {
				System.out.println("The Sum of Angles is Not Exactly 180 ");
			}

		}

		else {
			System.out.println("Invalid Angle");
		}

	}

}
