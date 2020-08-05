package com.ajith.reservation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajith.reservation.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
