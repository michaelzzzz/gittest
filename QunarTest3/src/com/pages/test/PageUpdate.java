package com.pages.test;

import android.app.Activity;
import android.widget.TextView;

import com.robotium.solo.Solo;


public class PageUpdate {
private Solo solo;
private TextView cancel;
public PageUpdate(Solo solo){
	this.solo= solo;
}
/**
 * 用来加载出更新页面
 */

public void initViews(){
//	cancel = (TextView)solo.getView("com.mqunar.atom.attemper:id/atom_atte_iv_close");
	Activity act =solo.getCurrentActivity();//获取当前的activity
    int id1 =act.getResources().getIdentifier("atom_atte_iv_close" ,"id",act.getPackageName());//获取id
    cancel = (TextView)solo.getView(id1);
}
public void clickOncancel(){
	solo.clickOnView(cancel);
}

}
