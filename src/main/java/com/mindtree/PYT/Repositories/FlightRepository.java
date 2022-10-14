package com.mindtree.PYT.Repositories;

import java.util.ArrayList;
import java.util.HashMap;

public interface FlightRepository {
    Flights addFlight(int FlightId,String Location, HashMap<String,String> DestinationCostMap);

    Flights updateFlight(int FlightId,String Location, HashMap<String,String> DestinationCostMap);

    Flights deleteFlight(int FlightId);

    ArrayList<Flights> viewAllFlights();
}
