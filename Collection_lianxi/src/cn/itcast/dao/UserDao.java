package cn.itcast.dao;

import cn.itcast.pojo.User;

/**
 * ���Ƕ��û������Ľӿ�
 * @author Administrator
 *
 */
public interface UserDao {
	/**
	 * 
	 * @param username
	 * 				�û���
	 * @param password
	 * 				����
	 * @return
	 * 				�Ƿ��¼�ɹ�
	 */				
public abstract boolean isLogin(String username,String password);
/**
 * ������void����Ϊע�ᵽ�����У��浽��������һ���ɹ��� �����Է���ֵΪ0�������壬��void
 * �����������ΪUser user  ����Ϊ�û�������Ϊһ�����ݴ���ģ��û��������벻�ǵ������룬
 * ������ܻ����а��ð�������֮���ע����Ϣ�����Ե�������������������ʱ�򣬽����������ʱ��
 * ���������Ķ���
 * @param user
 */
public abstract void regin(User user);
}
