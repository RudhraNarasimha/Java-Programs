package com.datatypes.practice;

public class Calculator {

	int a;
	int b;
	float c;

	void sum() {
		c = a + b;
		
		System.out.println("The Sum of Two Numbers is : "+c);
	}

	void pro() {
		c = a * b;
		System.out.println("The Product of Two Numbers is : "+c);
	}

	void div() {
		c = a / b;
		
		System.out.println("The Division of Two Numbers is : "+c);

	}

	void diff() {
		c = a - b;
		System.out.println("The Difference  of Two Numbers is : "+c);
	}


}
