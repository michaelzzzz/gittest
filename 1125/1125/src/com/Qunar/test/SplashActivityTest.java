package com.Qunar.test;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.view.View;

import com.robotium.solo.Solo;

@SuppressWarnings("rawtypes")
public class SplashActivityTest extends ActivityInstrumentationTestCase2 {
	public Solo solo;

	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.mqunar.splash.SplashActivity";

	private static Class<?> launcherActivityClass;
	static {
		try {
			launcherActivityClass = Class
					.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public SplashActivityTest() throws ClassNotFoundException {
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

	public boolean clickByID(String id) {
		View view;
		if (id == "") {

			return false;
		}
		Activity act = solo.getCurrentActivity();// 获取当前的activity
		int id1 = act.getResources().getIdentifier(id, "id",
				act.getPackageName());// 获取id
		view = solo.getView(id1);// 得到view
		solo.clickOnView(view);// 点击View
		return true;
	}

	/*
	 * public void testRun() { // Wait for activity:
	 * 'com.mqunar.splash.SplashActivity' solo.waitForActivity("SplashActivity",
	 * 2000); // Wait for activity:
	 * 'com.mqunar.atom.alexhome.ui.activity.MainActivity'
	 * assertTrue("MainActivity is not found!",
	 * solo.waitForActivity("MainActivity")); // Wait for activity:
	 * 'com.mqunar.atom.attemper.pupgrade.PUpgradeActivity'
	 * assertTrue("PUpgradeActivity is not found!",
	 * solo.waitForActivity("PUpgradeActivity"));
	 * clickByID("atom_alexhome_finding_default"); solo.goBack(); }
	 */
}
