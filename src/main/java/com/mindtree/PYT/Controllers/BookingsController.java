package com.mindtree.PYT.Controllers;

import com.mindtree.PYT.Entities.Bookings;
import com.mindtree.PYT.Entities.Package;
import com.mindtree.PYT.Services.BookingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/bookings")
public class BookingsController {

    @Autowired
    BookingsService bookingsService;

    @PostMapping("/add")
    public String addBooking(@RequestBody Bookings bookings) {
        try {
            this.bookingsService.addBooking(bookings);
            return "Booking added \n"+bookings;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Use Valid Input";
        }
    }


    @GetMapping("/get")
    public List<Bookings> getAllBookings(){
        try {
            return this.bookingsService.getAllBookings();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

    @GetMapping("/get/{packageID}")
    public Optional<Bookings> getBookingById(@PathVariable long packageID) {
        try {
            return this.bookingsService.getBookingById(packageID);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return Optional.empty();
        }

    }

    @DeleteMapping("/delete/{packageID}")
    public String deleteBooking(@PathVariable long packageID) {
        try {
            this.bookingsService.deleteBooking(packageID);
            return "Package deleted with package ID "+packageID;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Use Valid Input";
        }
    }

}
