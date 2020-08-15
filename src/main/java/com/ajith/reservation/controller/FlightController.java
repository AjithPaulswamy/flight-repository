package com.ajith.reservation.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ajith.reservation.entity.Flight;
import com.ajith.reservation.repo.FlightRepository;

@Controller
public class FlightController {
	
	@Autowired
	FlightRepository flightRepo;
	
	@RequestMapping("searchFlight")
	public String searchFlight(@RequestParam("from")String from,@RequestParam("to")String to,
			@RequestParam("departureDate") @DateTimeFormat(pattern="MM-dd-yyyy") Date departureDate,ModelMap modelMap) {
		List<Flight> flightList =flightRepo.searchFlight(from, to, departureDate);
		modelMap.addAttribute("flightList", flightList);
		return "flight/findFlights";
		
	}

}
