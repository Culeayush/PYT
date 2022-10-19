package com.mindtree.PYT.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
@Document(collection = "Flights")
public class Flight {
    @Id
    private long flightId;
    @Field
    private String location;
    @Field
    private HashMap<String,String> destinationCostMap;

    public Flight() {
    }

    public Flight(long flightId, String location, HashMap<String, String> destinationCostMap) {
        this.flightId = flightId;
        this.location = location;
        this.destinationCostMap = destinationCostMap;
    }

    public long getFlightId() {
        return flightId;
    }

    public void setFlightId(long flightId) {
        this.flightId = flightId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public HashMap<String, String> getDestinationCostMap() {
        return destinationCostMap;
    }

    public void setDestinationCostMap(HashMap<String, String> destinationCostMap) {
        this.destinationCostMap = destinationCostMap;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightId=" + flightId +
                ", location='" + location + '\'' +
                ", destinationCostMap=" + destinationCostMap +
                '}';
    }
}
