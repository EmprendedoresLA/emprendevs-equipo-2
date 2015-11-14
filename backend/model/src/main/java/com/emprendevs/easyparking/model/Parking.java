package com.emprendevs.easyparking.model;


import java.util.Calendar;
import java.text.SimpleDateFormat;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;


public class Parking {

    @Id
    private String id;

    private String userID;
    private Address address;
    private Calendar beginDate;
    private Calendar endDate;
    private Calendar cancelledDate;
    private String state;
    
    //anotada para evitar la excepcion MappingException
    @Transient
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public Parking(String id, String userID, Address address, Calendar beginDate, Calendar endDate,
			Calendar cancelledDate, String state) {
		this.id = id;
		this.userID = userID;
		this.address = address;
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.cancelledDate = cancelledDate;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Parking [id=" + id + ", userID=" + userID + ", streetName=" + address.getStreetName() + ", streetNumber="
				+ address.getStreetNumber() 
				+ ", beginDate=" + dateFormat.format(beginDate.getTime()) 
				+ ", endDate=" + dateFormat.format(endDate.getTime()) 
				+ ", cancelledDate=" + dateFormat.format(cancelledDate.getTime()) 
				+ ", state= " + state
				+ "]";
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getUserID() {
		return userID;
	}


	public void setUserID(String userID) {
		this.userID = userID;
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

