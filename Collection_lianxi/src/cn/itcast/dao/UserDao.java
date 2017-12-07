package cn.itcast.dao;

import cn.itcast.pojo.User;

/**
 * 这是对用户操作的接口
 * @author Administrator
 *
 */
public interface UserDao {
	/**
	 * 
	 * @param username
	 * 				用户名
	 * @param password
	 * 				密码
	 * @return
	 * 				是否登录成功
	 */				
public abstract boolean isLogin(String username,String password);
/**
 * 这里用void是因为注册到集合中，存到集合中是一定成功的 ，所以返回值为0，无意义，用void
 * 传入参数变量为User user  是因为用户数据作为一组数据传入的，用户名和密码不是单独传入，
 * 后面可能还会有爱好啊，年龄之类的注册信息，所以当参数变量大于三个的时候，建议我们这个时候
 * 传入这个类的对象。
 * @param user
 */
public abstract void regin(User user);
}
