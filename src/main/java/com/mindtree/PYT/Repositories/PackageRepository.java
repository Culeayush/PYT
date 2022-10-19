package com.mindtree.PYT.Repositories;

import com.mindtree.PYT.Entities.Package;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackageRepository extends MongoRepository<Package,Long> {

}
