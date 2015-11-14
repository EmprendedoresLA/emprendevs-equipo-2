package com.emprendevs.easyparking.model;

import java.util.GregorianCalendar;

import com.emprendevs.easyparking.model.Address;
import com.emprendevs.easyparking.model.Parking;
import com.emprendevs.easyparking.model.User;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ParkingTest extends TestCase
{
    
    public ParkingTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( ParkingTest.class );
    }

    public void testParking()
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
        
        User userAgain = parking.getUser();
        assertEquals(user, userAgain);
        
        Address addressAgain = parking.getAddress();
        assertEquals(address, addressAgain);
    }
}
