package com.mindtree.PYT.Controllers;

import com.mindtree.PYT.Entities.Room;
import com.mindtree.PYT.Services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    RoomService roomService;

    @PostMapping("/add")
    public String addRoom(@RequestBody Room room) {
        try {
            this.roomService.addRoom(room);
            return "Room added \n"+room;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Use Valid Input";
        }
    }

    @GetMapping("/get")
    public List<Room> getAllRooms(){
        try {
            return this.roomService.getAllRoom();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

    @GetMapping("/getAvailable")
    public List<Room> getAvailableRooms(){
        try{
            return this.roomService.getAllAvailableRooms();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }

    }

    @GetMapping("/get/{roomId}")
    public Optional<Room> getInventoryById(@PathVariable long roomId) {
        try {
            return this.roomService.getRoomById(roomId);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return Optional.empty();
        }

    }

    @PutMapping("/update/{roomId}")
    public String updateRoom(@RequestBody Room room,@PathVariable long roomId) {
        try {
            this.roomService.updateRoom(roomId, room);
            return "Room updated.\n"+room;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Use Valid Input";
        }
    }

    @DeleteMapping("/delete/{roomId}")
    public String deleteRoom(@PathVariable long roomId) {
        try {
            this.roomService.deleteRoom(roomId);
            return "Room deleted with roomNumber "+roomId;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Use Valid Input";
        }
    }

}
