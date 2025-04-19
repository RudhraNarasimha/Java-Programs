//		4.Create a class TimeConverter with a method convert() that prints how many hours and minutes are in the given total minutes. Use an object to run the method.

package com.datatypes.practice;

public class TimeConverter {

	int hours;
	int minutes = 130;

	void convert() {

		hours = minutes / 60;
		minutes = minutes % 60;

		// TODO Auto-generated method stub

		System.out.println("hours : "+hours + " Minutes : " + minutes);

	}



}