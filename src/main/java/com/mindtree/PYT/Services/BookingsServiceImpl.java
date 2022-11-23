package com.mindtree.PYT.Services;

import com.mindtree.PYT.Entities.Bookings;
import com.mindtree.PYT.Entities.Package;
import com.mindtree.PYT.Repositories.BookingsRepository;
import com.mindtree.PYT.Repositories.PackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingsServiceImpl implements BookingsService {

    @Autowired
    private BookingsRepository bookingsRepository;

    @Override
    public void addBooking(Bookings bookings) {
        bookingsRepository.save(bookings);
    }

    @Override
    public  List<Bookings> getAllBookings(){
        return bookingsRepository.findAll();
    }

    @Override
    public Optional<Bookings> getBookingById(long packageID) {
        return bookingsRepository.findById(packageID);
    }

    @Override
    public void deleteBooking(long packageID){
         bookingsRepository.deleteById(packageID);
    }


}
