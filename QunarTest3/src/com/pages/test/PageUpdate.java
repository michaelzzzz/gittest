package com.pages.test;

import android.widget.TextView;

import com.robotium.solo.Solo;


public class PageUpdate {
private Solo solo;
private TextView cancel;
public PageUpdate(Solo solo){
	this.solo= solo;
}
/**
 * �������س�����ҳ��
 */

public void initViews(){
	cancel = (TextView)solo.getView("com.mqunar.atom.attemper:id/atom_atte_iv_close");
	
}
public void clickOncancel(){
	solo.clickOnView(cancel);
}

}
