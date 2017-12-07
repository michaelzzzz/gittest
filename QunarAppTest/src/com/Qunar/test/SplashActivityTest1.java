package com.Qunar.test;

import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class SplashActivityTest1 extends ActivityInstrumentationTestCase2 {
  	private Solo solo;
  	
  	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.mqunar.splash.SplashActivity";

    private static Class<?> launcherActivityClass;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
        }
    }
  	
  	@SuppressWarnings("unchecked")
    public SplashActivityTest1() throws ClassNotFoundException {
        super(launcherActivityClass);
    }

  	public void setUp() throws Exception {
        super.setUp();
		solo = new Solo(getInstrumentation());
		getActivity();
  	}
  
   	@Override
   	public void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();
  	}
  
	public void testRun() {
		// Wait for activity: 'com.mqunar.splash.SplashActivity'
		solo.waitForActivity("SplashActivity", 2000);
		// Wait for activity: 'com.mqunar.atom.alexhome.ui.activity.MainActivity'
		assertTrue("MainActivity is not found!", solo.waitForActivity("MainActivity"));
		// Click on   ¶©µ¥ LinearLayout ÇÀ
		solo.clickOnView(solo.getView(0x6e07001c));
		// Wait for activity: 'com.mqunar.atom.order.SchemeContral'
		assertTrue("SchemeContral is not found!", solo.waitForActivity("SchemeContral"));
		// Press menu back key
		solo.goBack();
	}
}
