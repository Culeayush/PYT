package com.mindtree.PYT.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
@Document(collection = "Flights")
public class Flight {
    @Id
    private long flightId;
    @Field
    private String location;
    @Field
    private ArrayList<String> destinations;

    @Field
    private ArrayList<Integer> costs;

    public Flight() {
    }

    public Flight(long flightId, String location, ArrayList<String> destinations, ArrayList<Integer> costs) {
        this.flightId = flightId;
        this.location = location;
        this.destinations = destinations;
        this.costs = costs;
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

    public ArrayList<String> getDestinations() {
        return destinations;
    }

    public void setDestinations(ArrayList<String> destinations) {
        this.destinations = destinations;
    }

    public ArrayList<Integer> getCosts() {
        return costs;
    }

    public void setCosts(ArrayList<Integer> costs) {
        this.costs = costs;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightId=" + flightId +
                ", location='" + location + '\'' +
                ", destinations=" + destinations +
                ", costs=" + costs +
                '}';
    }
}
