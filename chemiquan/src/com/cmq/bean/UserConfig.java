package com.cmq.bean;

/**
 * 
 * @author Andrew
 * 
 *         实体bean 对应 user_config表， 记录用户的基础配置
 */
public class UserConfig {
	private long user_id;

	// 记录要提醒的消息格式：“新增粉丝X新增评论”，使用时用“X”拆分。
	private String message_show;
	private boolean location;

	private boolean accept_email_tip;

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public String getMessage_show() {
		return message_show;
	}

	public void setMessage_show(String message_show) {
		this.message_show = message_show;
	}


	public boolean isLocation() {
		return location;
	}

	public void setLocation(boolean location) {
		this.location = location;
	}

	public boolean isAccept_email_tip() {
		return accept_email_tip;
	}

	public void setAccept_email_tip(boolean accept_email_tip) {
		this.accept_email_tip = accept_email_tip;
	}

}
