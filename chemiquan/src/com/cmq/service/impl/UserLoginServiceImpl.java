package com.cmq.service.impl;

import java.util.Map;

import com.cmq.bean.UserInfor;
import com.cmq.dao.UserInforDao;
import com.cmq.service.UserLoginService;
import com.opensymphony.xwork2.ActionContext;

public class UserLoginServiceImpl implements UserLoginService {
	/** 依赖spring注入 */
	private UserInforDao userInforDao;

	public UserInfor login(UserInfor user) {
		String password = user.getPassword();
		String email = user.getEmail();
		String name = user.getName();
		
		System.out.println(email+"  ::  "+name);
		
		user = userInforDao.getUserInforByEmailAndPassword(email, password);
		if (user == null) {
			user = userInforDao.getUserInforByNameAndPassword(name, password);
			if (user != null) {
				return user;
			} else
				return null;
		} else {
			return user;
		}
	}

	public UserInforDao getUserInforDao() {
		return userInforDao;
	}

	public void setUserInforDao(UserInforDao userInforDao) {
		this.userInforDao = userInforDao;
	}

}
