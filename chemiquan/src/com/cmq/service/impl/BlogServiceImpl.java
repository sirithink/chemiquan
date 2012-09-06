package com.cmq.service.impl;

import com.cmq.bean.Blog;
import com.cmq.dao.BlogDao;
import com.cmq.service.BlogService;

public class BlogServiceImpl implements BlogService {
	/** 依赖于Spring的注入 */
	private BlogDao blogDao;

	public boolean add(Blog blog) {
		if (blogDao.save(blog))
			return true;
		else
			return false;
	}

	public BlogDao getBlogDao() {
		return blogDao;
	}

	public void setBlogDao(BlogDao blogDao) {
		this.blogDao = blogDao;
	}

}
