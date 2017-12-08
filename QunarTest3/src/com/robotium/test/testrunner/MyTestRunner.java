package com.robotium.test.testrunner;

import junit.framework.TestSuite;
import android.test.InstrumentationTestRunner;

import com.robotium.test.testsuite.MyTestSuite;

public class MyTestRunner extends InstrumentationTestRunner {
	public TestSuite getAllTests(){
		TestSuite suite = new TestSuite();
		suite.addTest(MyTestSuite.getTestSuite());
		return suite;
	}
}
