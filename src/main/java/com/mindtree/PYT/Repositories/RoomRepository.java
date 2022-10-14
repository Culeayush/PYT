package com.mindtree.PYT.Repositories;

import com.mindtree.PYT.Entities.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoomRepository extends MongoRepository<Room,Long> {
}
