package com.pageHelper.test;

import com.pages.test.PageLogin;
import com.solowrap.test.SoloWrap;

public class PageHelper {
protected static   SoloWrap solo;


protected static   PageLogin pageLogin;
@SuppressWarnings("static-access")
public PageHelper(SoloWrap solo){
	this.solo = solo;
}
public static  PageLogin getPageLogin(){
	if(pageLogin==null){
		pageLogin = new PageLogin(solo);
	}
	pageLogin.initViews();
	return pageLogin;
}


}
