package com.emprendevs.easyparking.model;


import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Parking extends AbstractDocument {

    @DBRef
    private User user;
    @DBRef
    private Address address;
    private Calendar beginDate;
    private Calendar endDate;
    private Calendar cancelledDate;
    private String state;
    
    //anotada para evitar la excepcion MappingException
    @Transient
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public Parking(User user, Address address, Calendar beginDate, Calendar endDate, Calendar cancelledDate, String state) {
		super();
		this.user = user;
		this.address = address;
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.cancelledDate = cancelledDate;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Parking [id=" + this.getId() + ", userID=" + user.getId() + ", streetName=" + address.getStreetName() + ", streetNumber="
				+ address.getStreetNumber() 
				+ ", beginDate=" + dateFormat.format(beginDate.getTime()) 
				+ ", endDate=" + dateFormat.format(endDate.getTime()) 
				+ ", cancelledDate=" + dateFormat.format(cancelledDate.getTime()) 
				+ ", state= " + state
				+ "]";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Calendar getBeginDate() {
		return beginDate;
	}


	public void setBeginDate(Calendar beginDate) {
		this.beginDate = beginDate;
	}


	public Calendar getEndDate() {
		return endDate;
	}


	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}


	public Calendar getCancelledDate() {
		return cancelledDate;
	}


	public void setCancelledDate(Calendar cancelledDate) {
		this.cancelledDate = cancelledDate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}

}

