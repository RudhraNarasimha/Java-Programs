package com.arthematic;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter byte value:");

		byte a = scanner.nextByte();
		System.out.println("Enter short value:");

		short b = scanner.nextShort();
		System.out.println("Enter int value:");

		int c = scanner.nextInt();
		System.out.println("Enter long value:");

		long d = scanner.nextLong();
		
		System.out.println("Enter float value:");
		float e = scanner.nextFloat();

		System.out.println("Enter double value:");
		double f = scanner.nextDouble();

		System.out.println("Enter boolean value:");
		boolean g = scanner.nextBoolean();

		System.out.println("Enter a String:");
		String h = scanner.next();

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);

	}

}