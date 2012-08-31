package com.cmq.action;

import java.util.Map;

import com.cmq.bean.UserInfor;
import com.cmq.service.UserLoginService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @author Andrew
 * 
 *         <p>
 *         用于用户注册
 *         </p>
 */
public class UserLoginAction extends ActionSupport {
	/** 依赖于Spring的注入 */
	private UserLoginService userLoginService;
	/** 可以使用邮箱或者昵称登录 */
	private String email_or_name;
	private String password;

	/** 获取系统session 登录成功后存入 */
	private Map session = ActionContext.getContext().getSession();

	/**
	 * 
	 * @return
	 */
	public String login() {
		UserInfor user = new UserInfor();
		user.setName(email_or_name);
		user.setEmail(email_or_name);
		user.setPassword(password);
		user = userLoginService.login(user);
		if (user != null) {
			session.put("user", user);
			return SUCCESS;
		} else

			return ERROR;
	}

	public UserLoginService getUserLoginService() {
		return userLoginService;
	}

	public void setUserLoginService(UserLoginService userLoginService) {
		this.userLoginService = userLoginService;
	}

	public String getEmail_or_name() {
		return email_or_name;
	}

	public void setEmail_or_name(String email_or_name) {
		this.email_or_name = email_or_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
