package com.mindtree.PYT.Repositories;

import com.mindtree.PYT.Entities.Flight;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface FlightRepository extends MongoRepository<Flight,Long> {

}
