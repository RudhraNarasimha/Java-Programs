package com.datatypes;

public class InpliciteTypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Integer Small to big
	
		
		short a = 120; // 2bbytes smaller data type
		
		// int b = (int) a; // 4 bytes larger data type this is also valid but not required 
		
		int b = (int) a; // 4 bytes 
		
		
		System.out.println(b);
		
		
		
		
		// 2.Decimal Small to Big
		
		float x = 212.36983f; // 4bytes
		
		// double y = (double)x; //this is also valid but not required 
		
		
		double y = x; // 8 bytes
		
		System.out.println(y);
	

	}

}
