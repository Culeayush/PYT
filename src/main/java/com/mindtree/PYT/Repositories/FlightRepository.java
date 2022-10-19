package com.mindtree.PYT.Repositories;

import com.mindtree.PYT.Entities.Flight;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface FlightRepository extends MongoRepository<Flight,Long> {

}
