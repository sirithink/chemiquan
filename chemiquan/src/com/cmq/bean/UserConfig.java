package com.cmq.bean;

/**
 * 
 * @author Andrew
 * 
 *         ʵ��bean ��Ӧ user_config�� ��¼�û��Ļ�������
 */
public class UserConfig {
	private long user_id;

	// ��¼Ҫ���ѵ���Ϣ��ʽ����������˿X�������ۡ���ʹ��ʱ�á�X����֡�
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
