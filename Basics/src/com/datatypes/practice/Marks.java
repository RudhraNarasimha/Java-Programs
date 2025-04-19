package com.datatypes.practice;

import java.util.Scanner;

////4. Write a Java program to accept marks of three subjects.
//
//If any subject has marks < 35, print “Fail”.
//
//If passed, calculate average:
//
//≥ 80: “Distinction”
//
//≥ 60: “First Class”
//
//≥ 50: “Second Class”
//
//Else: “Pass”

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Subject1 Marks");
		int subject1 = scanner.nextInt();
		System.out.println("Enter Your Subject2 Marks");
		int subject2 = scanner.nextInt();
		System.out.println("Enter Your Subject3Marks");
		int subject3 = scanner.nextInt();

		int marks = subject1 + subject2 + subject3;
		if (subject1 >= 35 && subject2 >= 35 && subject3 >= 35) {

			double avg = (marks / 3);

			if (avg >= 80) {
				System.out.println("Distinction");
				System.out.println(avg);

			} else if (avg >= 60) {

				System.out.println("First Class");
				System.out.println(avg);

			}

			else if (avg >= 50) {

				System.out.println("Second Class");
				System.out.println(avg);

			} else {
				System.out.println("Pass");
			}

		} else {
			System.out.println("Fail");
		}

	}
}
