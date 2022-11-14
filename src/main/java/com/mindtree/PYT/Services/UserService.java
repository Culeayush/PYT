package com.mindtree.PYT.Services;

import com.mindtree.PYT.Entities.Bookings;
import com.mindtree.PYT.Entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void addUser(User user);

    List<User> getAllUser();

    Optional<User> getUserById(long userID);

    void updateUser(long userID, User user);

    void deleteUser(long userID);

    void addBooking(long userID, Bookings bookings);

    Optional<Bookings> getAllBookings(long userID);

    void deleteBookingById(long userID);

}
