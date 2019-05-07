package com.fekade.JUnit;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestCalculator {
	
	CalcConcat cc = new CalcConcat();
	
	@Test
	public void test() {
		assertEquals(10, cc.add(4, 5));
	}

}
// 1. create a JUnit Test Case class for the purpose of testing other classes (right click on package
//    under src/test/java package - New - JUnitTestCase and name it (TestCalculator)
// 2. create an obj of the class to be tested (cc) as shown above
// 3. create a test method ( test() or any name) to test the method in the class under test 
// 4. Use the @Test annotation to tell java that this is a test method
// 5. use assertEquals method of org.jUnit.Assert imported, and supply arguments: expected result and 
//	  actual result from the method
// 4. Run it (note the option is run as JUnit test)
// 5. Green bar shows up if our method is PASS and Red if our method is FAIL