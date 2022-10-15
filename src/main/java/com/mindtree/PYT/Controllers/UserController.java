package com.mindtree.PYT.Controllers;

import com.mindtree.PYT.Entities.User;
import com.mindtree.PYT.Repositories.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        try{
            this.userService.addUser(user);
            return "User added : "+user.getUserID();
        }
        catch(Exception e){
            System.out.println(e);
            return "Use Valid Input";
        }
    }

    @GetMapping("/get")
    public List<User> getAllUsers(){
        try {
            return this.userService.getAllUser();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @GetMapping("/get/{userID}")
    public Optional<User> getUserById(@PathVariable long userID) {
        try {
            return this.userService.getUserById(userID);
        } catch (Exception e) {
            e.printStackTrace();
            return Optional.empty();
        }

    }

    @PutMapping("/update/{userID}")
    public String updateUser(@RequestBody User user,@PathVariable long userID) {
        try {
            this.userService.updateUser(userID, user);
            return "Updated : "+user;
        } catch (Exception e) {
            System.out.println(e);
            return "Enter Valid Input";
        }
    }

    @DeleteMapping("/delete/{userID}")
    public String deleteUser(@PathVariable long userID){
        try{
            this.userService.deleteUser(userID);
            return "User Deleted : "+userID;
        }
        catch (Exception e){
            System.out.println(e);
            return "invalid user ID";
        }
    }


}
