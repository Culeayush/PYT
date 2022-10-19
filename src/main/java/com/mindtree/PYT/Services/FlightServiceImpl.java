package com.mindtree.PYT.Services;

import com.mindtree.PYT.Entities.Flight;
import com.mindtree.PYT.Repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightServiceImpl implements FlightService{

    @Autowired
    private FlightRepository flightRepository;

    @Override
    public void addFlight(Flight flight) {
        flightRepository.save(flight);
    }

    @Override
    public List<Flight> getAllFlight() {
        return flightRepository.findAll();
    }

    @Override
    public Optional<Flight> getFlightById(long flightId) {
        return flightRepository.findById(flightId);
    }

    @Override
    public void updateFlight(long flightId, Flight flight) {
        flightRepository.save(flight);
    }

    @Override
    public void deleteFlight(long flightId) {
        flightRepository.deleteById(flightId);
    }
}
