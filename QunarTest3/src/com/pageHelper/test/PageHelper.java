package com.pageHelper.test;

import com.pages.test.PageLogin;
import com.pages.test.PageUpdate;
import com.robotium.solo.Solo;

public class PageHelper {
private Solo solo;
private  PageLogin pageLogin;
private  PageUpdate pageupdate;


public PageHelper(Solo solo){
	this.solo = solo;
}
/**
 * ��ҳ��
 * @return
 */
public  PageLogin getPageLogin(){
	if(pageLogin==null){
		pageLogin = new PageLogin(solo);
	}
	pageLogin.initViews();
	return pageLogin;
}
/**
 * ���¿�
 * @return
 */
public  PageUpdate getPageUpdate(){
	if(pageupdate==null){
		pageupdate = new PageUpdate(solo);
	}
	pageupdate.initViews();
	return pageupdate;
}

}
