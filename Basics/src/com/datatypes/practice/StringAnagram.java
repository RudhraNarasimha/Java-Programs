package com.datatypes.practice;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {

		// Write a method that checks if two strings are anagrams or not.

		String str1 = "Lemon";
		String str2 = "Mleon";

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() == str2.length()) {

			char arr[] = str1.toCharArray();
			char arr1[] = str2.toCharArray();

			Arrays.sort(arr);
			Arrays.sort(arr1);

			boolean b = Arrays.equals(arr, arr1);

			if (b) {

				System.out.println("It's An Anagram");
			} else {
				System.out.println("Not An Anagram");
			}

		}

		else {

			System.out.println("Not Anagram");

		}

	}

}
