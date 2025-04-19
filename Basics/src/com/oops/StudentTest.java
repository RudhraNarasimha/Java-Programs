package com.oops;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// object Creation

		// declaring objects

		Student obj1 = new Student(); // Student() - this is Object and obj 1 is Object name (reference of an Object)
		Student obj2 = new Student(); // obj 2 is Object name (reference of an Object)

		// Alternative of Declaration and Initialzation

		/*
		 * Student obj1; Student obj2 ;
		 * 
		 * obj1 = new Student(); obj2 = new Student();
		 */

		// new Student(); ---> Anonymous Object

		// object 1

		obj1.rollno = "RUDHQWEN124";
		obj1.name = "Rudhra";
		obj1.age = 20;

		// object 2

		obj2.rollno = "RUDHQWEN125";
		obj2.name = "Rudhra";
		obj2.age = 17;

		obj1.getStudentDetails();
		obj2.getStudentDetails();

	}

}
