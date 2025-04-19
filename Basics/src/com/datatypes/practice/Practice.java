package com.datatypes.practice;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Any Number");

		int lines = scanner.nextInt();

		for (int line = lines; line >= 1; line--) {             // 5
			for (int star = 1; star <= line; star++) {          // 1         1 <= 5  ,   1,2,3,4,5        
				System.out.print(star + " ");					//			2 <= 5			 
			}
			System.out.println();
		}

//		// Star Pattern
////
////		for (int i = 1; i <= a; i++) { // i = 1
////
////			for (int j = 1; j <= a; j++) {
////
////				System.out.print("*");
////
////			}
////			System.out.println();
////		}
//
//		// Star Pattern - 2
//
//		for (int i = 1; i <= a; i++) {
//
//			for (int j = i; j <= a; j++) {
//
//				System.out.print("*" + " ");
//			}
//			System.out.println();
	}

}
