package com.mindtree.PYT.Services;

import com.mindtree.PYT.Entities.Bookings;
import com.mindtree.PYT.Entities.Package;

import java.util.List;
import java.util.Optional;

public interface BookingsService {

    void addBooking(Bookings bookings);

    List<Bookings> getAllBookings();

    Optional<Bookings> getBookingById(long packageID);


    void deleteBooking(long packageID);
}
