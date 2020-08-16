package com.ajith.reservation.rest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ajith.reservation.dto.ReservatonUpdateRequest;
import com.ajith.reservation.entity.Reservation;
import com.ajith.reservation.repo.ReservationRepository;

@RestController
@CrossOrigin
public class FlightReservationRestService {

	@Autowired
	ReservationRepository reservationRepo;
	
	@GetMapping("/bookingDetail")
	public Reservation getBookingDetail(@RequestParam Long id) 
	{
		Optional<Reservation> findById = reservationRepo.findById(id);
		return findById.get();
	}
	
	@RequestMapping("/checkIn")
	public Reservation updateReservation(@RequestBody ReservatonUpdateRequest request) {
		Optional<Reservation> reservation = reservationRepo.findById(request.getId());
		Reservation reservation2 = reservation.get();
		reservation2.setNumberOfBags(request.getNumberOfBags());
		reservation2.setCheckedIn(1);
		Reservation save = reservationRepo.save(reservation2);
		return save;
	}
}

