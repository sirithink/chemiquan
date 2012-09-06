package com.cmq.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cmq.bean.Blog;
import com.cmq.dao.BlogDao;

public class BlogDaoImpl extends HibernateDaoSupport implements BlogDao {

	@Override
	public boolean save(Blog blog) {
		this.getHibernateTemplate().save(blog);
		return true;
	}

}
