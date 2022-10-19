package com.mindtree.PYT.Repositories;

import com.mindtree.PYT.Entities.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends MongoRepository<Room,Long> {
}
