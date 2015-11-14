package com.emprendevs.easyparking.paymentscheduler;

import java.util.TimerTask;

import com.emprendevs.easyparking.model.Parking;

public class PaymentTask extends TimerTask {
	
	private Parking parking;
	private PaymentBroker broker;
	private long duration;

	PaymentTask(Parking parking, long duration, PaymentBroker broker){
		this.parking = parking;
		this.duration = duration;
		this.broker = broker;
	}

	@Override
	public void run() {
		broker.pay(
				parking.getUser(),
				parking.getAddress(),
				duration
		);
	}

}
