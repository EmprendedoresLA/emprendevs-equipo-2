package com.emprendevs.easyparking.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.emprendevs.easyparking.model.Address;

public interface AddressRepository extends MongoRepository<Address, String> {

}
