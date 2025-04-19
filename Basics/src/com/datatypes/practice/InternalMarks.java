package com.datatypes.practice;

public class InternalMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float english = 58f;
		float telugu = 70.5f;
		float maths = 59f;
		float social = 75f;
		float computers = 84.5f;
		double total = english + telugu + maths + social + computers;
		double per = total / 500 * 100;
		double avg = total / 5;

		System.out.println("English Marks : " + english);
		System.out.println("Telugu Marks : " + telugu);
		System.out.println("Maths Marks : " + maths);
		System.out.println("Social Marks : " + social);
		System.out.println("Computer Marks : " + computers);
		System.out.println("the Average Marks : " + avg);
		System.out.println(" Total Marks : " + total);
		System.out.println(" Percentage  : " + per);
	}	
	

}
