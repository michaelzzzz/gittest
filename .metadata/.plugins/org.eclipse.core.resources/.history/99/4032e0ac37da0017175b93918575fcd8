package com.pages.test;

import android.widget.LinearLayout;

import com.solowrap.test.SoloWrap;

public class PageLogin {
private SoloWrap solo;
private LinearLayout homepage,order,find,service,my;
public PageLogin(SoloWrap solo){
	this.solo= solo;
}
/**
 * 用来加载出这个页面的控件
 */
public void initViews(){
	homepage = (LinearLayout)solo.getview("com.mqunar.atom.alexhome:id/atom_alexhome_home_default");
	order = (LinearLayout)solo.getview("com.mqunar.atom.alexhome:id/atom_alexhome_order_default");
	find = (LinearLayout)solo.getview("com.mqunar.atom.alexhome:id/atom_alexhome_finding_default");
	service = (LinearLayout)solo.getview("com.mqunar.atom.alexhome:id/atom_alexhome_service_default");
	my = (LinearLayout)solo.getview("com.mqunar.atom.alexhome:id/atom_alexhome_uc_default");
}
public void clickOnHomePage(){
	solo.clickOnUnderButton(homepage);
}
public void clickOnOrder(){
	solo.clickOnUnderButton(order);
}
public void clickOnFind(){
	solo.clickOnUnderButton(find);
}
public void clickOnService(){
	solo.clickOnUnderButton(service);
}
public void clickOnMy(){
	solo.clickOnUnderButton(my);
}


}
