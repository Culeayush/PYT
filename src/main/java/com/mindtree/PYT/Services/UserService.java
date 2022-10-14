package com.mindtree.PYT.Services;

import com.mindtree.PYT.Entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void addUser(User user);

    List<User> getAllUser();

    Optional<User> getUserById(String userID);

    void updateUser(String userID, User user);

    void deleteUser(User userID);

}
