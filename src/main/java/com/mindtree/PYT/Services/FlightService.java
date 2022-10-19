package com.mindtree.PYT.Services;

import com.mindtree.PYT.Entities.Flight;

import java.util.List;
import java.util.Optional;

public interface FlightService {

    void addFlight(Flight flight);

    List<Flight> getAllFlight();

    Optional<Flight> getFlightById(long flightId);

    void updateFlight(long flightId, Flight flight);

    void deleteFlight(long flightId);

}
