package com.cmq.service;

import com.cmq.bean.UserInfor;

/**
 * 
 * @author Andrew
 * 
 *         <p>
 *         对于注册业务的规范，可以有不同的实现，
 *         </p>
 */
public interface UserRegistService {

	/**
	 * 注册业务，传入userInfor对象，比较是否存在，不存在则存入数据库返回成功
	 * 
	 * @param userInfor
	 *            传入UserInfor
	 * @return Boolean值
	 */
	boolean regist(UserInfor userInfor);

}
