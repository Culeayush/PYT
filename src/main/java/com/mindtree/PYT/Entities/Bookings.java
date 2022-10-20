package com.mindtree.PYT.Entities;

import java.util.ArrayList;

public class Bookings {
    private ArrayList<Room> room;
    private ArrayList<Flight> flight;
    private ArrayList<Package> pkg;

    public Bookings() {
        room = new ArrayList<>();
        flight = new ArrayList<>();
        pkg = new ArrayList<>();
    }

    public ArrayList<Room> getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room.add(room);
    }

    public ArrayList<Flight> getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight.add(flight);
    }

    public ArrayList<Package> getPkg() {
        return pkg;
    }

    public void setPkg(Package pkg) {
        this.pkg.add(pkg);
    }
}
