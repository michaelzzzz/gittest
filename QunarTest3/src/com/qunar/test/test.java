package com.qunar.test;

import com.basic.test.BasicTest;

public class test extends BasicTest {

public  test(){
	super();
}

public void testQunar(){
	assertTrue("PUpgradeActivity is not found!", solo.waitForActivity("PUpgradeActivity"));
	pageHelper.getPageUpdate().clickOncancel();
	assertTrue("MainActivity is not found!", solo.waitForActivity("MainActivity"));
	pageHelper.getPageLogin().clickOnMy();
}
}