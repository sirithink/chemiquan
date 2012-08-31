package com.cmq.service.impl;

import com.cmq.bean.UserInfor;
import com.cmq.dao.UserInforDao;
import com.cmq.service.UserRegistService;

/**
 * 
 * @author Andrew
 * 
 *         <p>
 *         处理与注册相关的业务操作
 *         </p>
 */
public class UserRegistServiceImpl implements UserRegistService {
	/** 通过Spring注入的对象，处理userInfor与数据库相关的东西 */
	private UserInforDao userInforDao;

	public boolean regist(UserInfor userInfor) {
		if(userInforDao.getUserInforByEmail(userInfor.getEmail())==null){
			userInforDao.add(userInfor);
			return  true;
		}
		return false;
	}

	public UserInforDao getUserInforDao() {
		return userInforDao;
	}

	public void setUserInforDao(UserInforDao userInforDao) {
		this.userInforDao = userInforDao;
	}

}
