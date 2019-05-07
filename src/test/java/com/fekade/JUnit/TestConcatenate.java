package com.fekade.JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestConcatenate {
	
	CalcConcat cc=new CalcConcat();

	@Test
	public void test() {
		assertEquals("Fekade HM",cc.concatenate("Fekade", "HM"));
		
		//note this method could simply be added next to the assert method in TestCalculator class
		//as additional assert method. Multiple assert methods are possible in one test class
	}

}
