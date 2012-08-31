package com.cmq.bean;

import java.sql.Date;

/**
 * 
 * @author Andrew
 * 
 *         œ‡≤·±Ì
 * 
 */
public class PhotoAlbum {
	private long id;
	private long user_id;
	private String name;
	private String describes;
	private int photo_count;
	private Date create_time;

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

	public int getPhoto_count() {
		return photo_count;
	}

	public void setPhoto_count(int photo_count) {
		this.photo_count = photo_count;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
}
