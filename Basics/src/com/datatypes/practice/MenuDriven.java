package com.datatypes.practice;

import java.util.Scanner;

public class MenuDriven {

	/*
	 * 1. Create a menu-driven Java program that allows the user to choose: 1.Square
	 * of a number
	 * 
	 * 2.Cube of a number
	 * 
	 * 3.Check if number is even or odd
	 * 
	 * 4.Exit the program Use switch-case and loop the menu until the user selects
	 * Exit.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("1. Square");
			System.out.println("2. Cube");
			System.out.println("3. Even or Odd");
			System.out.println("4. Exit");

			choice = scanner.nextInt();

			if (choice <= 4) {

				switch (choice) {
				case 1:
					System.out.println("Enter Any Number");
					int num = scanner.nextInt();
					int square = num * num;
					System.out.println("The Square of this Number " + num + " is : " + square);
					System.out.println();
					break;

				case 2:
					System.out.println("Enter Any Number");
					int num1 = scanner.nextInt();
					int cube = num1 * num1 * num1;
					System.out.println("The Square of this Number " + num1 + " is : " + cube);
					System.out.println();
					break;

				case 3:
					System.out.println("Enter Any Number");
					int num2 = scanner.nextInt();
					if (num2 > 0 && num2 % 2 == 0) {
						System.out.println("The Given Number is Even");
						System.out.println();
					} else if (num2 > 0) {
						System.out.println("The Given Number is Odd");
						System.out.println();
					} else {

						System.out.println("Entered Number is Not in the Index Range ");
					}
					break;
				case 4:
					System.out.println("************************END**********************************");
					System.out.println();
					scanner.close();
					return; // Return is used to Call the Choice 4 Because We use Return for Method Calling

				default:
					System.out.println("Enter the Correct Choice");

				}

			} else {

				System.out.println("Given Choice is Out Of Range");
			}

		}

	}
}
