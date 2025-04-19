package com.variables;

public class Formula {

	int a, b;

	void getFormula() {

		int result = a * a + b * b + 2 * a * b; // result is the Local Variable, Because it is Declared inside the
												// Method

		System.out.println(result);

//
//		int c;
//		System.out.println(c); error
	}

}
