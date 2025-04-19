package com.operators;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;

		int b = 20;

		System.out.println(a++); // 10

		System.out.println(a); // 11

		System.out.println(++a); // 12

		System.out.println(b--); // 20

		System.out.println(b); // 19

		System.out.println(--b); // 18

		int c = (a++) + (--b) + (a++) + (b--) + (--a) + (b--) + (++a) + (++b);

		System.out.println(c);
	}

}
