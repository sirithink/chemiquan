package com.cmq.bean;

import java.sql.Date;

public class BlogCategory {

	private long id;
	private long userId;
	private String name;
	private String describes;
	private int blog_count;
	private Date create_time;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescribes() {
		return describes;
	}

	public void setDescribes(String describes) {
		this.describes = describes;
	}

	public int getBlog_count() {
		return blog_count;
	}

	public void setBlog_count(int blog_count) {
		this.blog_count = blog_count;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
}
