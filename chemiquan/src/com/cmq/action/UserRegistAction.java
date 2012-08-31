package com.cmq.action;

import com.cmq.bean.UserInfor;
import com.cmq.service.UserRegistService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @author Andrew
 * 
 *         <p>
 *         用户注册action
 *         </p>
 */
public class UserRegistAction extends ActionSupport {
	/** 用户注册的邮箱地址，用此区别用户,前台传入设置set get 方法 */
	private String email;
	/** 用户密码 */
	private String password;
	/** 接口，靠spring注入对象 ，注册业务逻辑的处理者 */
	private UserRegistService userRegistService;

	/**
	 * 处理用户注册，当前台传入
	 * email和password时就拼装UserIfor对象，与数据库比对是否存在该用户，如果不存在就存入数据库，返回success
	 * ，如果存在就返回error_user_exist.
	 * 
	 * @return 根据处理情况返回对应的String值
	 */
	public String regist() {
		UserInfor userInfor = new UserInfor();
		userInfor.setEmail(email);
		userInfor.setPassword(password);
		if (userRegistService.regist(userInfor)) {
			return SUCCESS;
		} else
			return "ERROR_USER_EXIST";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public UserRegistService getUserRegistService() {
		return userRegistService;
	}

	public void setUserRegistService(UserRegistService userRegistService) {
		this.userRegistService = userRegistService;
	}

}
