package com.mindtree.PYT.Repositories;

import com.mindtree.PYT.Entities.Flight;
import com.mindtree.PYT.Entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;
import java.util.HashMap;

public interface FlightRepository extends MongoRepository<Flight,Long> {

}
