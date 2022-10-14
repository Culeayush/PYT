package com.mindtree.PYT.Repositories;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
@Repository
public class Flights {
    private int FlightId;
    private String  Location;
    private HashMap<String,String> DestinationCostMap;

    public Flights() {
    }

    public Flights(int FlightId,String location, HashMap<String, String> destinationCostMap) {
        FlightId = FlightId;
        Location = location;
        DestinationCostMap = destinationCostMap;
    }

    public int getFlightId() {
        return FlightId;
    }

    public void setFlightId(int flightId) {
        FlightId = flightId;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public HashMap<String, String> getDestinationCostMap() {
        return DestinationCostMap;
    }

    public void setDestinationCostMap(HashMap<String, String> destinationCostMap) {
        DestinationCostMap = destinationCostMap;
    }
}
