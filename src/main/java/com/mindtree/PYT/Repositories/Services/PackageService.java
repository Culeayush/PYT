package com.mindtree.PYT.Repositories.Services;

import com.mindtree.PYT.Entities.Package;

import java.util.List;
import java.util.Optional;

public interface PackageService {
    void addPackage(Package pkg);

    List<Package> getAllPackage();

    Optional<Package> getPackageById(long packageID);

    void updatePackage(long packageID, Package pkg);

    void deletePackage(long packageID);

}
