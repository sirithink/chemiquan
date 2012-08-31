package com.cmq.bean;

import java.sql.Date;

/**
 * 
 * @author Andrew
 * 
 *         ндуб╠М
 */

public class UserOperateRecord {
	private long id;
	private long user_id;
	private long item_id;

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

	public long getItem_id() {
		return item_id;
	}

	public void setItem_id(long item_id) {
		this.item_id = item_id;
	}

}
