package com.emprendevs.easyparking.paymentscheduler;

import java.util.GregorianCalendar;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.emprendevs.easyparking.PaymentBrokerMock;
import com.emprendevs.easyparking.model.Address;
import com.emprendevs.easyparking.model.Parking;
import com.emprendevs.easyparking.model.User;

public class SchedulerTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SchedulerTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SchedulerTest.class );
    }

    public void testScheduler()
    {
    	User user = new User("Federico", "123456", "EYG722", "abc123");
    	Address address = new Address("Montevide", 1500);
        Parking parking = new Parking(
        		user,
        		address,
        		GregorianCalendar.getInstance(),
        		GregorianCalendar.getInstance(),
        		GregorianCalendar.getInstance(),
        		"Cancelled"
        );
        
        PaymentBroker broker = new PaymentBrokerMock();
        
        Scheduler scheduler = new Scheduler(broker);
        
        scheduler.schedulePayment(parking);
        
        User userAgain = ((PaymentBrokerMock)broker).getUser();
        assertEquals(userAgain, user);
    }
}
