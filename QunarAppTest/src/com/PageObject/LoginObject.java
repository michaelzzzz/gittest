package com.PageObject;

//import org.junit.After;
//import org.junit.Before;
import org.junit.Test;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
//import android.view.View;
import android.view.View;

import com.robotium.solo.Solo;

@SuppressWarnings("rawtypes")
public class LoginObject extends ActivityInstrumentationTestCase2{
	private Solo solo;
	//apk启动activity定义
	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.mqunar.splash.SplashActivity";
	//获取avtivity.class文件
    private static Class<?> launcherActivityClass;
	private View  view;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
        }
    }
@SuppressWarnings("unchecked")
public LoginObject() throws ClassNotFoundException {
    super(launcherActivityClass);
}

public void setUp() throws Exception {
    super.setUp();
	solo = new Solo(getInstrumentation(),getActivity());
	}
@Override
public void tearDown() throws Exception{
	solo.finishOpenedActivities();
	super.tearDown();
}

@Test
public void testAddNote() throws Exception {
	LoginObject loginobject = new LoginObject();
	loginobject.clickById("atom_alexhome_finding_default");
}

public boolean clickById(String id) {

    if(id==""){

         return false;
      }
        Activity act =solo.getCurrentActivity();//获取当前的activity
        int id1 =act.getResources().getIdentifier(id,"id",act.getPackageName());//获取id
        view = solo.getView(id1);//得到view
      solo.clickOnView(view);//点击View
  return true;
}

}

