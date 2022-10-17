package com.mindtree.PYT.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
@Repository
public class Flight {
    @Id
    private int FlightId;
    @Field
    private String  Location;
    @Field
    private HashMap<String,String> DestinationCostMap;

    public Flight() {
    }

    public Flight(int FlightId, String location, HashMap<String, String> destinationCostMap) {
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
