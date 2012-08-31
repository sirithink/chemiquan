package com.cmq.dao;

import com.cmq.bean.UserInfor;

/**
 * 
 * <p>
 * 处理一切与UserInfor实体bean相关操作
 * </p>
 * 
 * @author Andrew
 * 
 */
public interface UserInforDao {
	/**
	 * 通过email地址从数据库查找userInfor,如果存在就返回该对象，如果不存在就返回null
	 * 
	 * @param email
	 *            <code> String</code>类型的值
	 * @return UserInfor对象或者null
	 */
	public UserInfor getUserInforByEmail(String email);

	/**
	 * 向数据库添加一个userinfor对象
	 * 
	 * @param userInfor UserInfor
	 * @return Boolean
	 */
	public boolean add(UserInfor userInfor);

	/**
	 * 通过email地址和密码得到userInfor，如果匹配返回该对象，如果不匹配返回null
	 * 
	 * @param email String
	 * @param password String
	 * @return UserInfor对象
	 */
	public UserInfor getUserInforByEmailAndPassword(String email,
			String password);

	/**
	 * 通过昵称和密码得到userInfor，如果匹配返回该对象，如果不匹配返回null
	 * 
	 * @param name String
	 * @param password String
	 * @return  UserInfor
	 */
	public UserInfor getUserInforByNameAndPassword(String name, String password);
}
