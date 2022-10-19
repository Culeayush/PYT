package com.mindtree.PYT.Services;

import com.mindtree.PYT.Entities.Package;
import com.mindtree.PYT.Repositories.PackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PackageServiceImpl implements PackageService{

    @Autowired
    private PackageRepository packageRepository;

    @Override
    public void addPackage(Package pkg) {
        packageRepository.save(pkg);
    }

    @Override
    public List<Package> getAllPackage() {
        return packageRepository.findAll();
    }

    @Override
    public Optional<Package> getPackageById(long packageID) {
        return packageRepository.findById(packageID);
    }

    @Override
    public void updatePackage(long packageID, Package pkg) {
        packageRepository.save(pkg);
    }

    @Override
    public void deletePackage(long packageID) {
        packageRepository.deleteById(packageID);
    }
}
