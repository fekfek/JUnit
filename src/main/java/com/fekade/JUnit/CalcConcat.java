package com.fekade.JUnit;

public class CalcConcat {
	public int add(int i, int j) {
		return i+j;
	}
	public String concatenate(String str1, String str2) {
		String str3=str1 +" "+ str2;
		return str3;
	}

}
// 1. create a maven proj with a simple quick start option
// 2. create a class with 2 methods that: adds 2 numbers and Concatenate 2 strings as shown above

// To test the above class we test its methods as:

// 3. create a JUnit test case in src/test/java package - right click on the package - JUnit Test 
//	  Case (if JUnit test case is not available, click other and search - write test) - give name 
//	  (meaningful names such as: TestCalculator)
// 