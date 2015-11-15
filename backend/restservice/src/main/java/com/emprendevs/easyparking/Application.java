package com.emprendevs.easyparking;

import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.emprendevs.easyparking.model.Address;
import com.emprendevs.easyparking.model.Parking;
import com.emprendevs.easyparking.model.User;
import com.emprendevs.easyparking.model.repository.AddressRepository;
import com.emprendevs.easyparking.model.repository.ParkingRepository;
import com.emprendevs.easyparking.model.repository.UserRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	private ParkingRepository parkingRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private AddressRepository addressRepository;

    public static void main(String[] args) {
    	
        SpringApplication.run(Application.class, args);
    }
    
    public void run(String... args) throws Exception {
    	
    	User user = new User("federico", "123456", "EYG722", "abc123");
    	Address address = new Address("Montevideo", 1500);    	
        Parking parking = new Parking(
        		user,
        		address,
        		GregorianCalendar.getInstance(),
        		GregorianCalendar.getInstance(),
        		GregorianCalendar.getInstance(),
        		"Cancelled"
        );
        
        userRepository.save(user);
        addressRepository.save(address);
		parkingRepository.save(parking);
    	
    }
}

