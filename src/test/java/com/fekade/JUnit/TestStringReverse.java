package com.fekade.JUnit;

import static org.junit.Assert.*;


import org.junit.Test;

public class TestStringReverse {

	@Test
	public void test() {
		StringManipulation sm=new StringManipulation();
		String result=sm.reverseString("Mamamia");
		assertEquals("aimamaM", result);
		
	}

}
