package com.mindtree.PYT.Services;

import com.mindtree.PYT.Entities.Bookings;
import com.mindtree.PYT.Entities.User;
import com.mindtree.PYT.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;
    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(long userID) {
        return userRepository.findById(userID);
    }

    @Override
    public void updateUser(long userID, User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(long user) {
        userRepository.deleteById(user);
    }

    @Override
    public void addBooking(long userID, Bookings bookings) {
        User u = userRepository.findById(userID).get();
        u.setBookings(bookings);
        userRepository.save(u);
    }

    @Override
    public Optional<Bookings> getAllBookings(long userID) {
        User u = userRepository.findById(userID).get();
        if (u.getBookings()==null)
            return Optional.empty();
        else
            return Optional.of(u.getBookings());
    }

    @Override
    public void deleteBookingById(long userID) {
        User u = userRepository.findById(userID).get();
        u.setBookings(null);
    }
}
