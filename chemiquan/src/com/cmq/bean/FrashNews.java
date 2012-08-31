package com.cmq.bean;

import java.sql.Date;

/**
 * 
 * @author Andrew
 * 
 *         ндуб╠М
 */

public class FrashNews {
	private long id;
	private long user_id;
	private Date publish_time;
	private String content;
	private int comment_count;
	private int visitor_count;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUser_id() {
		return user_id;
	}


	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public Date getPublish_time() {
		return publish_time;
	}

	public void setPublish_time(Date publish_time) {
		this.publish_time = publish_time;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getComment_count() {
		return comment_count;
	}

	public void setComment_count(int comment_count) {
		this.comment_count = comment_count;
	}

	public int getVisitor_count() {
		return visitor_count;
	}

	public void setVisitor_count(int visitor_count) {
		this.visitor_count = visitor_count;
	}
}
