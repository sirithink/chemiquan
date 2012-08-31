package com.cmq.bean;

import java.sql.Date;

/**
 * 
 * @author Andrew
 * 
 *         È¦×Ó±í
 */

public class Circle {
	private long id;
	private String name;
	private long owner_id;
	private long administrator_id;
	private String notice;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getOwner_id() {
		return owner_id;
	}

	public void setOwner_id(long owner_id) {
		this.owner_id = owner_id;
	}

	public long getAdministrator_id() {
		return administrator_id;
	}

	public void setAdministrator_id(long administrator_id) {
		this.administrator_id = administrator_id;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

}
