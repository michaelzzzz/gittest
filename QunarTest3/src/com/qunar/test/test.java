package com.qunar.test;

import com.basic.test.BasicTest;

public class test extends BasicTest {

public  test(){
	super();
}

public void testQunar(){
	pageHelper.getPageUpdate().clickOncancel();
	pageHelper.getPageLogin().clickOnMy();
}
}