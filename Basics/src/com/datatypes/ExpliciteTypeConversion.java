package com.datatypes;

public class ExpliciteTypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Large to Small

		long x = 20000L; // 8 bytes larger Data Type

		int y = (int) x; // 4 bytes Smaller Data Type, this should be done explicitly

		System.out.println(y);

		// 2. Large to Small

		double a = 4563.123456789; // 8 bytes larger Data Type 

		int b =  (int) a; // 4 bytes Smaller Data Type, this should be done explicitly

		System.out.println(b);

	}

}
