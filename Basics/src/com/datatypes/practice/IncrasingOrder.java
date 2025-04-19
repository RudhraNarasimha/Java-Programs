package com.datatypes.practice;

import java.util.Scanner;

public class IncrasingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Write a Java program to display number-increasing reverse pyramid
//		 1  2  3  4 
//		 5  6  7 
//		 8  9 
//		 10 

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Any Number: ");

		int number = scanner.nextInt();
		int count = 1;

		for (int line = number; line >= 1; line--) { // number = 5

			for (int num = 1; num <= line; num++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();

		}

	}

}
