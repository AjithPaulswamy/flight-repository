<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Find Flights</title>
</head>
<body>
<!-- search flight query form  -->
<form action="searchFlight" method="post">
From :<input type="text" name="from">
To :<input type="text" name="to">
Departure Date :<input type="text" name="departureDate">
<input type="submit" value="Search">
</form>

<c:set var="flightListSize" value="${flightList.size()}"/>
<c:if test="${flightListSize > 0}">

<!-- display search flight list  -->
<h1> Flights </h1>
<table>
<!-- Table Header -->
<tr>
<th>Airlines</th>
<th>Departure City</th>
<th>Arrival City</th>
<th>Departure Time</th>
</tr>

<!--  Table Body -->
<c:forEach items="${flightList}" var="flight">
<tr>
<td>${flight.operatingAirlines}</td>
<td>${flight.departureCity}</td>
<td>${flight.arrivalCity}</td>
<td>${flight.estimatedDepartureTime}</td>
<td><a href="showCompleteReservationForm?flightId=${flight.flightNumber}">Select</a></td>
</tr>
</c:forEach>

</table>

</c:if>


</body>
</html>