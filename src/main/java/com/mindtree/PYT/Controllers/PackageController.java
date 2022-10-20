package com.mindtree.PYT.Controllers;

import com.mindtree.PYT.Entities.Package;
import com.mindtree.PYT.Services.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/package")
public class PackageController {

    @Autowired
    PackageService packageService;

    @PostMapping("/add")
    public String addPackage(@RequestBody Package pkg) {
        try {
            this.packageService.addPackage(pkg);
            return "Package added \n"+pkg;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Use Valid Input";
        }
    }

    @GetMapping("/get")
    public List<Package> getAllPackage(){
        try {
            return this.packageService.getAllPackage();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }


    @GetMapping("/get/{packageID}")
    public Optional<Package> getPackageById(@PathVariable long packageID) {
        try {
            return this.packageService.getPackageById(packageID);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return Optional.empty();
        }

    }

    @PutMapping("/update/{packageID}")
    public String updatePackage(@RequestBody Package pkg,@PathVariable long packageID) {
        try {
            this.packageService.updatePackage(packageID, pkg);
            return "Package updated.\n"+pkg;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Use Valid Input";
        }
    }

    @DeleteMapping("/delete/{packageID}")
    public String deletePackage(@PathVariable long packageID) {
        try {
            this.packageService.deletePackage(packageID);
            return "Package deleted with package ID "+packageID;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Use Valid Input";
        }
    }

}