package com.wipro.model;





public class User {
	
	 private String userid;
	 private String  password;
	 private String userlevel;
	 
	 
	

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return userid;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserlevel() {
		return userlevel;
	}
	public void setUserlevel(String userlevel) {
		this.userlevel = userlevel;
	}
	public User() {
		
	}
	public User(String userid, String password, String userlevel) {
		super();
		this.userid = userid;
		this.password = password;
		this.userlevel = userlevel;
	}
	public User(String userid) {
		super();
		this.userid = userid;
	}

}
