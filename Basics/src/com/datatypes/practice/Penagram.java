package com.datatypes.practice;

public class Penagram {
	public static void main(String args[]) {

		String sen = "y dog";

		sen = sen.toLowerCase();

		char[] ch = sen.toCharArray();

		boolean[] alpha = new boolean[26];

		int index = 0;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				index = ch[i] - 'a';
				alpha[index] = true;
			}

		}

		for (int i = 0; i < alpha.length; i++) {

			if (alpha[i] == false) {

				System.out.println("Not a Pangram");
				return;
			}

		}
		System.out.println("It is a Pangram");
	}

}
