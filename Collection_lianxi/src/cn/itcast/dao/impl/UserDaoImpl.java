package cn.itcast.dao.impl;

import java.util.ArrayList;

import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;

public class UserDaoImpl implements UserDao {
	//Ϊ���ö�������ܹ�ʹ��ͬһ�����ϣ��Ͱ�������϶���Ϊ��Ա����
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
		//���û���Ϣ�洢
		
		array.add(user);

	}

}
