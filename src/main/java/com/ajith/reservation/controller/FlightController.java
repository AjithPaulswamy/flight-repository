package com.ajith.reservation.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ajith.reservation.entity.Flight;
import com.ajith.reservation.repo.FlightRepository;
import com.sun.tools.sjavac.Log;

@Controller
public class FlightController {
	
	Logger log = LoggerFactory.getLogger(FlightController.class);
	@Autowired
	FlightRepository flightRepo;
	
	@RequestMapping("searchFlight")
	public String searchFlight(@RequestParam("from")String from,@RequestParam("to")String to,
			@RequestParam("departureDate") @DateTimeFormat(pattern="MM-dd-yyyy") Date departureDate,ModelMap modelMap) {
		log.error("search flight");
		List<Flight> flightList =flightRepo.searchFlight(from, to, departureDate);
		modelMap.addAttribute("flightList", flightList);
		return "flight/findFlights";
		
	}

}
