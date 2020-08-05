package com.ajith.reservation;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ajith.reservation.entity.User;
import com.ajith.reservation.repo.UserRepository;

@SpringBootTest
class FlightReservationApplicationTests {

	@Autowired
	private UserRepository userRepo;
	
	@Test
	public void userCreateDbTest() {
		User user=new User();
		user.setFirstName("Ajith");
		user.setLastName("Paulswamy");
		user.setEmail("ajith.p@gmail.com");
		user.setPassword("password123");
		userRepo.save(user);
	}
	
	@Test
	public void userFetchDBTest() {
		List<User> userList = userRepo.findAll();
		for(User user:userList) {
			System.out.println(user.toString());
		}
	}

}
