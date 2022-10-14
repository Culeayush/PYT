package com.mindtree.PYT.Controllers;

import com.mindtree.PYT.Entities.User;
import com.mindtree.PYT.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/delete/{userID}")
    public String deleteUser(@PathVariable User user){
        try{
            this.userService.deleteUser(user);
            return "User Deleted : "+user;
        }
        catch (Exception e){
            System.out.println(e);
            return "invalid user ID";
        }
    }


}
