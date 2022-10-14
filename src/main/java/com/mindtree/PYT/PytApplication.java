package com.mindtree.PYT;

import com.mindtree.PYT.Entities.User;
import com.mindtree.PYT.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PytApplication implements CommandLineRunner {
	@Autowired
	private final UserRepository userRepository;

	public PytApplication(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(PytApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		if(userRepository.findAll().isEmpty()){
//			userRepository.save(new User(001L,"ayush",true,"sfsgf"));
//			userRepository.save(new User(002L,"peter",true,"sfsgf"));
//		}
		for(User user: userRepository.findAll())
			System.out.println(user);
	}

}
