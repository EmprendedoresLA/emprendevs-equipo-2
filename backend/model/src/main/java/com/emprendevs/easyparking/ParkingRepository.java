package com.emprendevs.easyparking;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.emprendevs.easyparking.model.Parking;

public interface ParkingRepository extends MongoRepository<Parking, String> {

    public List<Parking> findByUserID(String userID);

}
