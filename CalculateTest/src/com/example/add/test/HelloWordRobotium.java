package com.example.add.test;

import android.test.ActivityInstrumentationTestCase2;

import com.example.add.MainActivity;
import com.robotium.solo.Solo;

public class HelloWordRobotium extends ActivityInstrumentationTestCase2<MainActivity>{
	private Solo solo;	
	public HelloWordRobotium(){
		super(MainActivity.class);
	}
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		solo = new Solo(getInstrumentation(),getActivity());
	}
	
	public void testHelloWord(){
		solo.enterText(1,"123");
		solo.sleep(5000);
		
	}
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		solo.finishOpenedActivities();
		super.tearDown();
	}

}
