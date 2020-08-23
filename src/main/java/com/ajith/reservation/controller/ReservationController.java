package com.ajith.reservation.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ajith.reservation.dto.ReservationRequest;
import com.ajith.reservation.entity.Flight;
import com.ajith.reservation.entity.Reservation;
import com.ajith.reservation.repo.FlightRepository;
import com.ajith.reservation.services.ReservationServiceImpl;
import com.sun.tools.sjavac.Log;

@Controller
public class ReservationController {
	
	Logger log=LoggerFactory.getLogger(ReservationController.class);
	@Autowired
	FlightRepository flightRepo;
	
	@Autowired
	ReservationServiceImpl reservationService;
	
	@RequestMapping("showCompleteReservationForm")
	public String showCompleteReservation(@RequestParam("flightId") String flightId ,ModelMap modelMap  ) {
		log.info("complete Reservation for flight id");
		System.out.println("debug flightid - "+flightId);
		Flight flight=flightRepo.findByFlightNumber(flightId);
		System.out.println("debug flightid - "+flightId);
		modelMap.addAttribute("selectedFlight", flight);
		return "passenger/reservationDetails";
		
	}
	
	@RequestMapping("completeReservation")
	public String completeReservation(ReservationRequest reservationReq,ModelMap modelMap) {
		Reservation bookFlight = reservationService.bookFlight(reservationReq);
		
		modelMap.addAttribute("msg", "Flight Booking completed, reservation id - "+bookFlight.getId());
		return "passenger/reservationConfirmation";
	}

}
