package testtesgt;

import com.Qunar.test.Cooooo;
import com.Qunar.test.SplashActivityTest;

public class Testrun extends SplashActivityTest {

	public Testrun() throws ClassNotFoundException {
		super();

	}
	
	public void testRun() {
		// Wait for activity: 'com.mqunar.splash.SplashActivity'
		solo.waitForActivity("SplashActivity", 2000);
		// Wait for activity: 'com.mqunar.atom.alexhome.ui.activity.MainActivity'
		//assertTrue("MainActivity is not found!", solo.waitForActivity("MainActivity"));
		// Wait for activity: 'com.mqunar.atom.attemper.pupgrade.PUpgradeActivity'
		assertTrue("PUpgradeActivity is not found!", solo.waitForActivity("PUpgradeActivity"));
		clickByID(Cooooo.CHA);
		//solo.sleep(2000);
		clickByID(Cooooo.NAME);
		solo.goBack();
		clickByID(Cooooo.NAME1);
		solo.sleep(5000);
		solo.goBack();
	}
}