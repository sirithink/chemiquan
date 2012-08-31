package com.cmq.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cmq.bean.UserInfor;
import com.cmq.dao.UserInforDao;

public class UserInforDaoImpl extends HibernateDaoSupport implements
		UserInforDao {

	public UserInfor getUserInforByEmail(String email) {
		String hql = "from UserInfor  where email= '" + email + "' ";
		List<UserInfor> users = (List<UserInfor>) this.getHibernateTemplate()
				.find(hql);
		if (users.size() < 1) {
			return null;
		} else {
			return users.get(0);
		}
	}

	@Override
	public boolean add(UserInfor userInfor) {
		this.getHibernateTemplate().save(userInfor);
		return true;
	}

	@Override
	public UserInfor getUserInforByEmailAndPassword(String email,
			String password) {
		String hql = "from UserInfor  where email= '" + email
				+ "' and password='" + password + "'";
		List<UserInfor> users = (List<UserInfor>) this.getHibernateTemplate()
				.find(hql);
		if (users.size() < 1) {
			return null;
		} else {
			return users.get(0);
		}
	}

	@Override
	public UserInfor getUserInforByNameAndPassword(String name, String password) {
		String hql = "from UserInfor  where name= '" + name + "' and password='"
				+ password + "'";
		List<UserInfor> users = (List<UserInfor>) this.getHibernateTemplate()
				.find(hql);
		if (users.size() < 1) {
			return null;
		} else {
			return users.get(0);
		}
	}

}
