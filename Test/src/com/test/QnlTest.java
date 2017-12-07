package com.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

public class QnlTest extends ActivityInstrumentationTestCase2 {
	private Solo solo;
	//app启动avtivity定义
	private static  final String LAUNCHER_ACTIVITY_FULL_CLASSNAME="com.Qunarcom.mqunar.splash.SplashActivity";
	//获取avtivity.class文件
	private static Class<?> launcherActivityClass;
	static {
		try{
			launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
			
		}catch(Error e){
			try {
				throw new Exception(e);
			} catch (Exception e1) {	
				e1.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

@SuppressWarnings("uncheckes")
public QnlTest(){
	super(launcherActivityClass);
}
@Override
protected void setUp() throws Exception{
	solo = new Solo(getInstrumentation(),getActivity());
}
@Override
public void tearDown() throws Exception{
	solo.finishOpenedActivities();
}
	public void test(){
		solo.sleep(1000);
		solo.clickOnScreen(670, 98);
		solo.sleep(1000);
		solo.clickOnText("音乐");
		solo.sleep(1000);
	}
}



