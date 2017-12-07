package com.robotium.test.testsuite;

import junit.framework.TestSuite;
import testtesgt.Testrun;
import testtesgt.Testrun2;

public class MyTestSuite {
public static TestSuite getTestSuite(){
	TestSuite suite = new TestSuite();
	suite.addTestSuite(Testrun.class);
	suite.addTestSuite(Testrun2.class);
	return suite;
	
}
}
