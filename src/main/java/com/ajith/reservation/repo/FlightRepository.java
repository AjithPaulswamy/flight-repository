package com.ajith.reservation.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ajith.reservation.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {
	
	@Query("from Flight where flightNumber=:flightId")
	public Flight findByFlightNumber(@Param("flightId") String flightNumber);
	
	@Query("from Flight where departureCity=:from and arrivalCity=:to and dateOfDeparture=:departureDate")
	public List<Flight> searchFlight(@Param("from") String from,@Param("to") String to,
			@Param("departureDate") Date departureDate);
}
