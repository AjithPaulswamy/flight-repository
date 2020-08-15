<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation Details</title>

</head>
<body>
<h2>Flight Details:</h2>
<pre>
Airlines : ${selectedFlight.operatingAirlines}
Departure City : ${selectedFlight.departureCity}
Arrival City : ${selectedFlight.arrivalCity}
Departure Time : ${selectedFlight.estimatedDepartureTime}
</pre>

<h2>Passenger Details:</h2>
<form action="completeReservation" method="post">
<pre>
First Name :<input type="text" name="firstName">
Last Name :<input type="text" name="lastName">
Middle Name :<input type="text" name="middleName">
Email :<input type="text" name="email">
Phone :<input type="text" name="phone">

<input type="hidden" name="flightId" value="${selectedFlight.flightNumber}">

<input type="submit" value="Book Ticket">
</pre>
</form>
</body>
</html>