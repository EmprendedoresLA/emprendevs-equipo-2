package com.emprendevs.easyparking.model;

public class User {
	
	String name;
	String phone;
	String licence;
	String password;
	
	public User(String name, String phone, String licence, String password) {
		super();
		this.name = name;
		this.phone = phone;
		this.licence = licence;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
}
