package com.emprendevs.easyparking.model.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.emprendevs.easyparking.model.Parking;
import com.emprendevs.easyparking.model.User;

public interface ParkingRepository extends MongoRepository<Parking, String> {

    public List<Parking> findByUser(User user);

}
