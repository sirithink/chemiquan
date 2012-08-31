package com.cmq.bean;

import java.sql.Date;

/**
 * 
 * @author Andrew
 * 
 *         œ‡≤· µÃÂ
 */

public class Photo {
	private long id;
	private long photo_album_id;
	private String name;
	private String path;
	private String describes;
	private int comment_count;
	private int vistitor_count;
	private Date publish_time;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getPhoto_album_id() {
		return photo_album_id;
	}

	public void setPhoto_album_id(long photo_album_id) {
		this.photo_album_id = photo_album_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}


	public int getComment_count() {
		return comment_count;
	}

	public void setComment_count(int comment_count) {
		this.comment_count = comment_count;
	}

	public int getVistitor_count() {
		return vistitor_count;
	}

	public void setVistitor_count(int vistitor_count) {
		this.vistitor_count = vistitor_count;
	}

	public Date getPublish_time() {
		return publish_time;
	}

	public void setPublish_time(Date publish_time) {
		this.publish_time = publish_time;
	}

	public String getDescribes() {
		return describes;
	}

	public void setDescribes(String describes) {
		this.describes = describes;
	}

}
