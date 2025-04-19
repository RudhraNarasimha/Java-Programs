package com.datatypes.practice;

public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float dis = 15f;
		
		double ogp = 120.50;

		double dp = (ogp * dis) / 100;
		
		double fp = ogp - dp;

		System.out.println("Original Price is " +ogp);
		
		System.out.println("Discount is : " +dis);

		
		System.out.println("Discounted Price is : " + dp);

		System.out.println("Final Price is : " + fp);
	}

}
