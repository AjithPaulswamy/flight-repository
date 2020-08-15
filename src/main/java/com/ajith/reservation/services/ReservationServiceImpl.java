package com.ajith.reservation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajith.reservation.dto.ReservationRequest;
import com.ajith.reservation.entity.Flight;
import com.ajith.reservation.entity.Passenger;
import com.ajith.reservation.entity.Reservation;
import com.ajith.reservation.repo.FlightRepository;
import com.ajith.reservation.repo.PassengerRepository;
import com.ajith.reservation.repo.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	FlightRepository flightRepo;
	
	@Autowired
	ReservationRepository reservationRepo;
	
	@Autowired
	PassengerRepository passengerRepo;
	
	@Override
	public Reservation bookFlight(ReservationRequest reservationReq) {
		
		Flight findByFlightNumber = flightRepo.findByFlightNumber(reservationReq.getFlightId());
		System.out.println(findByFlightNumber);
		
		Passenger passenger=new Passenger();
		passenger.setFirstName(reservationReq.getFirstName());
		passenger.setLastName(reservationReq.getLastName());
		passenger.setMiddleName(reservationReq.getMiddleName());
		passenger.setEmail(reservationReq.getEmail());
		passenger.setPhone(reservationReq.getPhone());
		Passenger savedPassenger  = passengerRepo.save(passenger);
		System.out.println("passenger saved");
		
		Reservation reservation=new Reservation();
		reservation.setPassenger(savedPassenger);
		reservation.setFlight(findByFlightNumber);
		reservation.setCheckedIn(0);
		System.out.println("About to save");
		Reservation save = reservationRepo.save(reservation);
		System.out.println("saved");
		return save;
	}

}
