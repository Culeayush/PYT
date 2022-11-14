package com.mindtree.PYT.Entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;

public class Bookings {
    @Id
    private long bookingId;
    @Field
    private ArrayList<Package> pkg;

    public Bookings() {
    }

    public Bookings(long bookingId, ArrayList<Package> pkg) {
        this.bookingId = bookingId;
        this.pkg = pkg;
    }

    public long getBookingId() {
        return bookingId;
    }

    public void setBookingId(long bookingId) {
        this.bookingId = bookingId;
    }

    public ArrayList<Package> getPkg() {
        return pkg;
    }

    public void setPkg(Package pkg) {
        this.pkg.add(pkg);
    }

    @Override
    public String toString() {
        return "Bookings{" +
                "bookingId=" + bookingId +
                ", pkg=" + pkg +
                '}';
    }
}
