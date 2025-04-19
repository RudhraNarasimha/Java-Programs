package com.datatypes.practice;

public class BodyMassIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Input weight and height as doubles, calculate BMI, and display the result rounded down to the nearest integer using casting.
		
		// It is Used for Roundoff
		
				
		double w1 = 75.00;
		
		
		double h1 = 1.7373;
		
		
		double bmi = (w1/(h1*h1));
		
		int bmi1 = (int)bmi;
		
		System.out.println("The Body Mass Index is : " + bmi1);
		
		
		

	}

}
