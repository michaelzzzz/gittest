package com.qunar.test;

import com.basic.test.BasicTest;

public class Test2  extends BasicTest {

public  Test2(){
	super();
}

public void testQunar2(){
	assertTrue("PUpgradeActivity is not found!", solo.waitForActivity("PUpgradeActivity"));
	pageHelper.getPageUpdate().clickOncancel();
	
}
}