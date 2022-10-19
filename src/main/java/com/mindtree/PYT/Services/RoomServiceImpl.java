package com.mindtree.PYT.Services;

import com.mindtree.PYT.Entities.Room;
import com.mindtree.PYT.Repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RoomServiceImpl implements RoomService{

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public void addRoom(Room room) {
        roomRepository.save(room);
    }

    @Override
    public List<Room> getAllRoom() {
        return roomRepository.findAll();
    }

    @Override
    public List<Room> getAllAvailableRooms() {
        List<Room> availableRooms = new ArrayList<>();

        for (Room room :  roomRepository.findAll()){
            if(room.isAvailable()) availableRooms.add(room);
        }

        return availableRooms;
    }

    @Override
    public Optional<Room> getRoomById(long roomId) {
        return roomRepository.findById(roomId);
    }

    @Override
    public void updateRoom(long roomId, Room room) {
        roomRepository.save(room);
    }

    @Override
    public void deleteRoom(long roomId) {
        roomRepository.deleteById(roomId);

    }
}
