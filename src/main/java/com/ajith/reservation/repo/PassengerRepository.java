package com.ajith.reservation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajith.reservation.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
