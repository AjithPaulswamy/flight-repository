package com.ajith.reservation.services;

import com.ajith.reservation.dto.ReservationRequest;
import com.ajith.reservation.entity.Reservation;

public interface ReservationService {
		public Reservation bookFlight(ReservationRequest reservationReq);
}
