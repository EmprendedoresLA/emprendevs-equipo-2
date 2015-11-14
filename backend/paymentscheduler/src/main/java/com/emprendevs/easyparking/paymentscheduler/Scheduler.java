package com.emprendevs.easyparking.paymentscheduler;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

import com.emprendevs.easyparking.model.Parking;

public class Scheduler {
	
	private final int COURTESY_TIME = 15 * 60 * 1000; // 10 min
	private final long MIN_PARKING_TIME = 15 * 60 * 1000; // 15 min

	Map<String, Timer> timers;
	private PaymentBroker broker;
	
	public Scheduler(PaymentBroker broker) {
		super();
		this.broker = broker;
		timers = new HashMap<String, Timer>();
	}
	
	public void schedulePayment(Parking parking){
		Timer timer = new Timer("ParkingTimer", false);
		Calendar now = new GregorianCalendar();
		long timeLeft = parking.getEndDate().getTimeInMillis() - now.getTimeInMillis();
		long possibleDuration = MIN_PARKING_TIME + COURTESY_TIME;
		long duration;
		if(timeLeft < possibleDuration) {
			if (timeLeft < MIN_PARKING_TIME) {
				duration = timeLeft;
			} else {
				duration = MIN_PARKING_TIME;
			}
		} else {
			duration = possibleDuration;
		}
		timer.schedule(new PaymentTask(parking, duration, broker), duration);
	}
	
}
