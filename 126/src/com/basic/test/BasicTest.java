package com.basic.test;

import android.test.ActivityInstrumentationTestCase2;

import com.pageHelper.test.PageHelper;
import com.robotium.solo.Solo;
import com.solowrap.test.SoloWrap;
@SuppressWarnings({ "deprecation", "rawtypes" })
public class BasicTest extends ActivityInstrumentationTestCase2 {
protected SoloWrap solo;
protected PageHelper pageHelper;
static Class START_CLS;
static{
	try {
		START_CLS = Class.forName("com.Qunarcom.mqunar.splash.SplashActivity");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}

@SuppressWarnings("unchecked")
public  BasicTest(){
	super(START_CLS);
}

@Override
protected void setUp() throws Exception {
	super.setUp();
	solo= new SoloWrap(new Solo(getInstrumentation(),getActivity()));
	pageHelper = new PageHelper(solo);
}

@Override
protected void tearDown() throws Exception {
	solo.finishOpenedActivities();
	super.tearDown();
}
}