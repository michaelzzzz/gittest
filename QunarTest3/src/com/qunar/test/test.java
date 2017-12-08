package com.qunar.test;

import com.basic.test.BasicTest;

public class test extends BasicTest {

public  test(){
	super();
}

public void testQunar(){
	assertTrue("MainActivity is not found!", solo.waitForActivity("MainActivity"));
	pageHelper.getPageLogin().clickOnMy();
}
}