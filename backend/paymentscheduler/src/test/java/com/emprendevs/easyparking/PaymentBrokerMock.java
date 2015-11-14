package com.emprendevs.easyparking;

import com.emprendevs.easyparking.model.Address;
import com.emprendevs.easyparking.model.User;
import com.emprendevs.easyparking.paymentscheduler.PaymentBroker;

public class PaymentBrokerMock implements PaymentBroker {

	private long duration;
	private Address address;
	private User user;

	public void pay(User user, Address address, long duration) {
		this.user = user;
		this.address = address;
		this.duration = duration;
	}

	public long getDuration() {
		return duration;
	}

	public Address getAddress() {
		return address;
	}

	public User getUser() {
		return user;
	}

}
