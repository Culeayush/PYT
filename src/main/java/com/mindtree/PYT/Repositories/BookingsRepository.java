package com.mindtree.PYT.Repositories;

import com.mindtree.PYT.Entities.Bookings;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingsRepository extends MongoRepository<Bookings,Long> {
}
