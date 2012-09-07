package com.cmq.dao;

import java.util.ArrayList;

import com.cmq.bean.Blog;

/**
 * 
 * @author Andrew
 *         <p>
 *         处理与blog表相关的 数据操作
 *         </p>
 */
public interface BlogDao {
	/**
	 * 添加新日志
	 * 
	 * @param blog
	 * @return boolean
	 */

	boolean save(Blog blog);

	/**
	 * 通过BlogCategoryId查找blog
	 * 
	 * @param id
	 * @return 装满blog的ArrayList
	 */
	ArrayList findBlogByBlogCategoryId(long id);

	/**
	 * 通过page得到对应的bloglist
	 * @param page
	 * @return ArrayList<Blog>
	 */
	ArrayList<Blog> getBlogListByPage(int page,int pageSize);

}
