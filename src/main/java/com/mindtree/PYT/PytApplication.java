package com.mindtree.PYT;

import com.mindtree.PYT.Entities.Flight;
import com.mindtree.PYT.Entities.Package;
import com.mindtree.PYT.Entities.Room;
import com.mindtree.PYT.Entities.User;
import com.mindtree.PYT.Repositories.PackageRepository;
import com.mindtree.PYT.Repositories.RoomRepository;
import com.mindtree.PYT.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.HashMap;

@SpringBootApplication
public class PytApplication implements CommandLineRunner {
	@Autowired
	private final PackageRepository packageRepository;

	public PytApplication(PackageRepository packageRepository) {
		this.packageRepository = packageRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(PytApplication.class, args);
	}

	@Override
	public void run(String... args) {


	}

}
