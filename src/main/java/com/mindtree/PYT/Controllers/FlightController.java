package com.mindtree.PYT.Controllers;

import com.mindtree.PYT.Entities.Flight;
import com.mindtree.PYT.Repositories.Services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/flight")
public class FlightController {

    @Autowired
    FlightService flightService;

    @PostMapping("/add")
    public String addFlight(@RequestBody Flight flight) {
        try {
            this.flightService.addFlight(flight);
            return "Flight added \n"+flight;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Use Valid Input";
        }
    }

    @GetMapping("/get")
    public List<Flight> getAllFlights(){
        try {
            return this.flightService.getAllFlight();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

    @GetMapping("/get/{flightId}")
    public Optional<Flight> getFlightById(@PathVariable long flightId) {
        try {
            return this.flightService.getFlightById(flightId);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return Optional.empty();
        }

    }

    @PutMapping("/update/{flightId}")
    public String updateRoom(@RequestBody Flight flight,@PathVariable long flightId) {
        try {
            this.flightService.updateFlight(flightId, flight);
            return "Flight updated.\n"+flight;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Use Valid Input";
        }
    }

    @DeleteMapping("/delete/{flightId}")
    public String deleteFlight(@PathVariable long flightId) {
        try {
            this.flightService.deleteFlight(flightId);
            return "Flight deleted with flight ID "+flightId;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Use Valid Input";
        }
    }

}
