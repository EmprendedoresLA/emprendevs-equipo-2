package com.emprendevs.easyparking.restservice;

import java.util.GregorianCalendar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emprendevs.easyparking.model.Address;
import com.emprendevs.easyparking.model.Parking;
import com.emprendevs.easyparking.model.User;

@RestController
public class ParkingController {
    
    User user = new User("Federico", "123456", "EYG722", "abc123");
	Address address = new Address("Montevideo", 1500);    	

    @RequestMapping("/parking")
    public Parking parking(@RequestParam(value="user", defaultValue="Fede") String name) {
        return new Parking(
        		user,
        		address,
        		GregorianCalendar.getInstance(),
        		GregorianCalendar.getInstance(),
        		GregorianCalendar.getInstance(),
        		"Cancelled"
        );
    }
}
