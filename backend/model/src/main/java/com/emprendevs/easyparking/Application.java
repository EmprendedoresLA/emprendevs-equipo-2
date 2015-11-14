package com.emprendevs.easyparking;


import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.emprendevs.easyparking.model.Parking;

@SpringBootApplication
public class Application implements CommandLineRunner
{
	@Autowired
	private ParkingRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();
	
		 /*
		 Parking:
		 String id, 
		 String userID, 
		 String streetName, 
		 int streetNumber, 
		 Calendar beginDate, 
		 Calendar endDate,
		 Calendar cancelledDate
		 */
			

		Calendar calendar = new GregorianCalendar();
		//System.out.println(dateFormat.format(calendar.getTime()));
		 
		// guardo un par de estacionamientos
		repository.save(new Parking("1", "Fede", "Cochabamba",345,calendar, calendar,calendar,"Cancelled"));
		repository.save(new Parking("2", "Fede", "Rioja",1232,calendar, calendar,calendar, "Active"));
		

		// obtengo todos los estacionamientos
		System.out.println();
		System.out.println("Parkings encontrados con findAll():");
		System.out.println("-------------------------------");
		for (Parking parking : repository.findAll()) {
			System.out.println(parking);
		}
		
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println();

	}
}
