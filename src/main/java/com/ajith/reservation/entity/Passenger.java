package com.ajith.reservation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PASSENGER")
public class Passenger extends AbstractEntity {
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="MIDDLE_NAME")
	private String middleName;
	@Column(name="EMAIL")
	private String email;
	@Column(name="PHONE")
	private String phone;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Passenger [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName
				+ ", email=" + email + ", phone=" + phone + "]";
	}

}
