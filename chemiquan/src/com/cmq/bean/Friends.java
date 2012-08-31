package com.cmq.bean;

/**
 * 
 * @author Andrew
 * 
 *        储存所有的朋友关系
 */

public class Friends {
	private long id;
	private long my_id;
	private long friend_id;
	private boolean black;
	private boolean listen;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getMy_id() {
		return my_id;
	}

	public void setMy_id(long my_id) {
		this.my_id = my_id;
	}

	public long getFriend_id() {
		return friend_id;
	}

	public void setFriend_id(long friend_id) {
		this.friend_id = friend_id;
	}

	public boolean isBlack() {
		return black;
	}

	public void setBlack(boolean black) {
		this.black = black;
	}

	public boolean isListen() {
		return listen;
	}

	public void setListen(boolean listen) {
		this.listen = listen;
	}
}
