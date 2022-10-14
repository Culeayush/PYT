package com.mindtree.PYT.Repositories;

import com.mindtree.PYT.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class flightRepositoryImpl implements FlightRepository{

    @Autowired
    private ArrayList<Flights> fList;
    private User user;

    public flightRepositoryImpl() {
        fList = new ArrayList<>();
        user = new User();
    }

    @Override
    public Flights addFlight(int FlightId, String Location, HashMap<String, String> DestinationCostMap) {
        if(!user.isAdmin())
            return null;

        Flights flightObj = new Flights(FlightId,Location,DestinationCostMap);
        fList.add(flightObj);
        return flightObj;
    }

    @Override
    public Flights updateFlight(int FlightId, String Location, HashMap<String, String> DestinationCostMap) {
        if(!user.isAdmin())
            return null;
        Flights flightObj = new Flights(FlightId,Location,DestinationCostMap);
        for (int i=0;i<fList.size();i++)
        {
            if(Objects.equals(fList.get(i).getFlightId(),FlightId))
                fList.set(i,flightObj);
        }
        return flightObj;
    }

    @Override
    public Flights deleteFlight(int FlightId) {
        if(!user.isAdmin())
            return null;
        Flights flightObj = null ;
        for(int i=0;i< fList.size();i++){
            if(Objects.equals(fList.get(i).getFlightId(),FlightId)) {
                flightObj = fList.remove(i);
            }
        }
        return flightObj;
    }

    @Override
    public ArrayList<Flights> viewAllFlights() {
        if(!user.isAdmin())
            return null;

        return fList;
    }
}
