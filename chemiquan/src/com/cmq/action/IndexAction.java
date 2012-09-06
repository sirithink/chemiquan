package com.cmq.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 处理访问主页时需要的数据
 * 
 * @author Andrew
 * 
 */
public class IndexAction extends ActionSupport {

	/**
	 * 访问主页进行计算
	 * @return String
	 */
	public String showIndex() {
		return SUCCESS;
	}
}
