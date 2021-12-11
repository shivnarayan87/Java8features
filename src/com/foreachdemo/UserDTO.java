package com.foreachdemo;

public class UserDTO {
	String username;
	
	String userid;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public UserDTO(String username, String userid) {
		this.username = username;
		this.userid = userid;
	}
	public UserDTO() {
		
	}
	

}
