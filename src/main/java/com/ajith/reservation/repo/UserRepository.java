package com.ajith.reservation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajith.reservation.entity.User;

public interface UserRepository extends JpaRepository<User,Long > {
	public User findByEmail(String email);
}
