package com.datatypes.practice;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Number");

		float a = scanner.nextFloat();
		System.out.println("Enter the Height of The Triangle");
		float b = scanner.nextFloat();

		double area = 0.5 * a * b;

		System.out.println("Area of the Triangle is : " + area);

		
		scanner.close();
	}


}
