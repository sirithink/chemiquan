package com.cmq.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cmq.bean.Blog;
import com.cmq.bean.BlogCategory;
import com.cmq.dao.BlogDao;

public class BlogDaoImpl extends HibernateDaoSupport implements BlogDao {

	public boolean save(Blog blog) {
		this.getHibernateTemplate().save(blog);
		return true;
	}

	public ArrayList findBlogByBlogCategoryId(long category_id) {
		String hql = "from Blog  where category_id= '" + category_id + "' ";
		List<Blog> blogs = (List<Blog>) this
				.getHibernateTemplate().find(hql);
		if (blogs.size() < 1) {
			return null;
		} else {
			return (ArrayList) blogs;
		}
	}

	public ArrayList<Blog> getBlogListByPage(int page,int pageSize) {
		String hql="from Blog order by publish_time desc";
		Session session = this.getHibernateTemplate().getSessionFactory().openSession();
		Query   query   =   session.createQuery(hql);
		query.setFirstResult((page-1)*pageSize);
		query.setMaxResults(pageSize); 
		ArrayList<Blog> blogLists = (ArrayList<Blog>)query.list();
		session.close();
		return blogLists;
	}

}
