package com.emprendevs.easyparking.model;

public class User extends AbstractDocument {
	
	String username;
	String phone;
	String licence;
	String password;
	
	public User(String username, String phone, String licence, String password) {
		super();
		this.username = username;
		this.phone = phone;
		this.licence = licence;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String name) {
		this.username = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getLicence() {
		return licence;
	}
	public void setLicence(String licence) {
		this.licence = licence;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", phone=" + phone + ", licence="
				+ licence + ", password=" + password + "]";
	}
	
}
