package com.cmq.service;

import com.cmq.bean.UserInfor;

/**
 * 
 * @author Andrew
 *         <P>
 *         用于登录，如果登录成功就将user返回
 *         </p>
 */
public interface UserLoginService {

	/**
	 * 如果成功就返回user
	 * 
	 * @param user
	 * @return UserInfor
	 */
	UserInfor login(UserInfor user);

}
