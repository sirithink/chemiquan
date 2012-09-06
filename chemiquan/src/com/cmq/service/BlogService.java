package com.cmq.service;

import com.cmq.bean.Blog;

/**
 * 
 * @author Andrew
 *         <p>
 *         处理与日志相关的 处理操作，写日志，写该日志，删除日志，查看日志
 *         </p>
 */
public interface BlogService {

	/**
	 * 添加日志
	 * @param blog
	 * @return boolean
	 */
	public boolean add(Blog blog);
}
