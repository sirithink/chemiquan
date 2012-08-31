package com.cmq.bean;

import java.sql.Date;

/**
 * 
 * @author Andrew
 * 
 *         消息提示表
 */
public class Message {
	private long id;
	private long from_id;
	private long to_id;
	private String content;
	private String type;
	private Date post_time;
	private boolean if_show;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getFrom_id() {
		return from_id;
	}

	public void setFrom_id(long from_id) {
		this.from_id = from_id;
	}

	public long getTo_id() {
		return to_id;
	}

	public void setTo_id(long to_id) {
		this.to_id = to_id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getPost_time() {
		return post_time;
	}

	public void setPost_time(Date post_time) {
		this.post_time = post_time;
	}

	public boolean isIf_show() {
		return if_show;
	}

	public void setIf_show(boolean if_show) {
		this.if_show = if_show;
	}

	
}
