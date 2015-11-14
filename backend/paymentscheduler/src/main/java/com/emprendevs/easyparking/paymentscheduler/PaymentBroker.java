package com.emprendevs.easyparking.paymentscheduler;

import com.emprendevs.easyparking.model.Address;
import com.emprendevs.easyparking.model.User;

public interface PaymentBroker {
	
	void pay(User user, Address address, long duration);

}
