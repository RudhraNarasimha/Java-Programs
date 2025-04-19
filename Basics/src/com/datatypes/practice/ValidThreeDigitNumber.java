package com.datatypes.practice;

import java.util.Scanner;

public class ValidThreeDigitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a Java program to check whether a number is a three-digit number. A
		// valid three-digit number lies between 100 to 999 or -100 to -999.

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Any Three Digit Number");
		int num = scanner.nextInt();
		
		if (num >= 100 && num <= 999 || num <= -100 && num >= -999)
		{
	
			
				System.out.println("Given Number is a valid Number");
	
		}
		else
			{
				System.out.println("Given Number is Not Valid Number");
			}
			

		

	}
	}
