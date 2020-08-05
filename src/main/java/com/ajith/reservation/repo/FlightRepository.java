package com.ajith.reservation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajith.reservation.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
