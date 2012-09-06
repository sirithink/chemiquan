package com.cmq.dao;

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

}
