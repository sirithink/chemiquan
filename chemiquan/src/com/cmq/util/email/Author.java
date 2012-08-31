package com.cmq.util.email;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class Author extends Authenticator {
	private String username;
	private String password;

	public Author(String username, String password) {
		this.username = username;
		this.password = password;

	}

	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(username, password);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
