package com.emprendevs.easyparking.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.emprendevs.easyparking.model.User;

public interface UserRepository extends MongoRepository<User, String> {

}
