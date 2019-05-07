package com.fekade.JUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCalculator.class, TestStringCount.class, TestStringReverse.class,
				TestConcatenate.class })

public class AllTests {

}

//Several Testing classes may need to be created to test multiple methods in one or multiple classes.
//Testing them individually may take time and not advisable. We use JUnit Suite to do multiple tests
//at once.

// right click on src/test/java - new - other - JUnit - Junit Test Suite; this gives the option
// to add all testing classes as shown above.