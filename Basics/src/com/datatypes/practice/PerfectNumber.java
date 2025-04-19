package com.datatypes.practice;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Any Number : ");

		int a = scanner.nextInt(); //

//		int div = 0;
//		int i = 1;
//		int sum=0;
//
//		while (i < a) {
//
//			if (a % i == 0) {
//				sum += i;
//
//			}
//			i++;
//		}
//		
//		if(a==sum) {
//			
//			System.out.println("p");
//		}

		int i = 1;
		int sum = 0;
		for (i = 1; i < a; i++) {

			if (a % i == 0) {

				sum += i;   // sum + i =  sum
			}
		}

		if (sum == a) {
			System.out.println(a + " is Perfect Number");

		} else {

			System.out.println(a + " is not Perfect Number");
		}

	}
}
