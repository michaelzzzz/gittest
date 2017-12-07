package cn.itcast.dao.impl;

import java.util.ArrayList;

import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;

public class UserDaoImpl implements UserDao {
	//为了让多个方法能够使用同一个集合，就把这个集合定义为成员变量
	private ArrayList<User> array = new ArrayList<User>();
	@Override
	public boolean isLogin(String username, String password) {
		boolean flag =false;
		for(User u:array){
		if(	u.getUsername().equals(username)&& 
				u.getPassword().equals(password)){
			flag =true;
			break;
		}
		}
		return flag;
	}

	@Override
	public void regin(User user) {
		//把用户信息存储
		
		array.add(user);

	}

}
