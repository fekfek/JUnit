package com.fekade.JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStringCount {

	@Test
	public void test() {
		StringManipulation sm=new StringManipulation();
		
		int a = sm.countLetter("Mamamia");
		assertEquals(3, a);
	}

}
