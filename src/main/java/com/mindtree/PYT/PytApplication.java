package com.mindtree.PYT;

import com.mindtree.PYT.Entities.Room;
import com.mindtree.PYT.Entities.User;
import com.mindtree.PYT.Repositories.RoomRepository;
import com.mindtree.PYT.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class PytApplication implements CommandLineRunner {
	@Autowired
	private final RoomRepository roomRepository;

	public PytApplication(RoomRepository roomRepository) {
		this.roomRepository = roomRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(PytApplication.class, args);
	}

	@Override
	public void run(String... args) {
//			roomRepository.save(new Room(2004L,"ayush",1000,true,new Date()));
//			roomRepository.save(new Room(2005L,"peter",1000,false,new Date()));
	}

}
