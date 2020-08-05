package com.ajith.reservation.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RESERVATION")
public class Reservation extends AbstractEntity {
	@Column(name="CHECKED_IN")
	private Integer checkedIn;
	@Column(name="NUMBER_OF_BAGS")
	private Integer numberOfBags;
	@OneToOne
	private Passenger passenger;
	@OneToOne
	private Flight flight;
	@Column(name="CREATED")
	private Timestamp created;

	public Integer getCheckedIn() {
		return checkedIn;
	}

	public Integer getNumberOfBags() {
		return numberOfBags;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public Flight getFlight() {
		return flight;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCheckedIn(Integer checkedIn) {
		this.checkedIn = checkedIn;
	}

	public void setNumberOfBags(Integer numberOfBags) {
		this.numberOfBags = numberOfBags;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "Reservation [checkedIn=" + checkedIn + ", numberOfBags=" + numberOfBags + ", passenger=" + passenger
				+ ", flight=" + flight + ", created=" + created + "]";
	}

}
