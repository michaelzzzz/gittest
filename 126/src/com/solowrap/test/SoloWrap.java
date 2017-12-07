package com.solowrap.test;

import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import com.robotium.solo.Solo;

public class SoloWrap {
	private Solo solo;
public SoloWrap(Solo solo){
	this.solo = solo;
}
public void clickOnTest(String text){
	Log.i("AUTO", "点击文本"+text);
	solo.clickOnText(text);
}
public View getview(String id) {
	Log.i("AUTO", "获取文本"+id);
	return solo.getView(id);
}
public void clickOnUnderButton(LinearLayout id){
	Log.i("AUTO", "点击按钮"+id);
	solo.clickOnView(id);
}
public void finishOpenedActivities(){
	solo.finishOpenedActivities();
}
}
