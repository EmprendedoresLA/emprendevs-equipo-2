package com.emprendevs.easyparking.model;


import java.util.Calendar;
import java.text.SimpleDateFormat;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;


public class Parking {

    @Id
    private String id;

    private String userID;
    private String streetName;
    private int streetNumber;
    private Calendar beginDate;
    private Calendar endDate;
    private Calendar cancelledDate;
    private String state;
    
    //anotada para evitar la excepcion MappingException
    @Transient
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public Parking() {}


	public Parking(String id, String userID, String streetName, int streetNumber, Calendar beginDate, Calendar endDate,
			Calendar cancelledDate, String state) {
		//super();
		this.id = id;
		this.userID = userID;
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.cancelledDate = cancelledDate;
		this.state = state;
	}




	@Override
	public String toString() {
		return "Parking [id=" + id + ", userID=" + userID + ", streetName=" + streetName + ", streetNumber="
				+ streetNumber 
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


	public String getStreetName() {
		return streetName;
	}


	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}


	public int getStreetNumber() {
		return streetNumber;
	}


	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
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





}

