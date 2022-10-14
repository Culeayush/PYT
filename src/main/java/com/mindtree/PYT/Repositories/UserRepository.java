package com.mindtree.PYT.Repositories;

import com.mindtree.PYT.Entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}
