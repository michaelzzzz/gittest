package com.pages.test;

import android.widget.LinearLayout;

import com.robotium.solo.Solo;

public class PageLogin {
private Solo solo;
private LinearLayout homepage,order,find,service,my;
public PageLogin(Solo solo){
	this.solo= solo;
}
/**
 * 用来加载出这个页面的控件
 */
public void initViews(){
	homepage = (LinearLayout)solo.getView("com.mqunar.atom.alexhome:id/atom_alexhome_home_default");
	order = (LinearLayout)solo.getView("com.mqunar.atom.alexhome:id/atom_alexhome_order_default");
	find = (LinearLayout)solo.getView("com.mqunar.atom.alexhome:id/atom_alexhome_finding_default");
	service = (LinearLayout)solo.getView("com.mqunar.atom.alexhome:id/atom_alexhome_service_default");
	my = (LinearLayout)solo.getView("com.mqunar.atom.alexhome:id/atom_alexhome_uc_default");
}
public void clickOnHomePage(){
	solo.clickOnView(homepage);
}
public void clickOnOrder(){
	solo.clickOnView(order);
}
public void clickOnFind(){
	solo.clickOnView(find);
}
public void clickOnService(){
	solo.clickOnView(service);
}
public void clickOnMy(){
	solo.clickOnView(my);
}


}
