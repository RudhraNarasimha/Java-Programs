package com.variables;

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee obj1 = new Employee(); // When New Operator used the JVM Was Invoked.

		Employee obj2 = new Employee(); // objects are Created in Heap Memory, Why Because Object Created at Runtime.

		obj1.id = 10;
		obj1.dept = "auditing";
		obj1.name = "Hari";
		obj1.salary = 75000.00;

		
		
		
		obj2.id = 11;
		obj2.dept = "Collection";
		obj2.name = "Krishna";
		obj2.salary = 175000;
		
		 
		obj1.getEmployeeDetails();
		obj2.getEmployeeDetails();

	}

}
