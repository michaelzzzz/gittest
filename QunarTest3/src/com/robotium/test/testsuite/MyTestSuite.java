package com.robotium.test.testsuite;

import junit.framework.TestSuite;

import com.qunar.test.Test2;
import com.qunar.test.test;

public class MyTestSuite {
 public static TestSuite getTestSuite(){
	 TestSuite suite = new TestSuite();
	 suite.addTestSuite(test.class);
	 suite.addTestSuite(Test2.class);
	 return suite;
 }
}
