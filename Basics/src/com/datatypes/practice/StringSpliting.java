package com.datatypes.practice;

public class StringSpliting {
// How do you split a String into an array of substrings based on a delimiter (“ , ”).
	public static void main(String[] args) {

		String str = "geeks,for,geeks";
		String arr[] = str.split(",");

		int count = 0;

		for (String word : arr) {

			if (str.indexOf(word) == str.lastIndexOf(word)) {

			}
			System.out.println(word);
		}

	}

}
