package com.pages.test;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.robotium.solo.Solo;

public class PageLogin {
private Solo solo;
private LinearLayout homepage,order,find,service,my;
public PageLogin(Solo solo){
	this.solo= solo;
}
/**
 * �������س����ҳ��Ŀؼ�
 */
public void initViews(){
//	homepage = (LinearLayout)solo.getView("com.mqunar.atom.alexhome:id/atom_alexhome_home_default");
//	order = (LinearLayout)solo.getView("com.mqunar.atom.alexhome:id/atom_alexhome_order_default");
//	find = (LinearLayout)solo.getView("com.mqunar.atom.alexhome:id/atom_alexhome_finding_default");
//	service = (LinearLayout)solo.getView("com.mqunar.atom.alexhome:id/atom_alexhome_service_default");
//	my = (LinearLayout)solo.getView("com.mqunar.atom.alexhome:id/atom_alexhome_uc_default");
	
	Activity act =solo.getCurrentActivity();//��ȡ��ǰ��activity
    int id1 =act.getResources().getIdentifier("atom_alexhome_uc_default" ,"id",act.getPackageName());//��ȡid
    my = (LinearLayout)solo.getView(id1);
 }
//public void clickOnHomePage(){
//	solo.clickOnView(homepage);
//}
//public void clickOnOrder(){
//	solo.clickOnView(order);
//}
//public void clickOnFind(){
//	solo.clickOnView(find);
//}
//public void clickOnService(){
//	solo.clickOnView(service);
//}
public void clickOnMy(){
	solo.clickOnView(my);
}

}
