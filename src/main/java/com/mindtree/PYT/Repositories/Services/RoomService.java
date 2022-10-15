package com.mindtree.PYT.Repositories.Services;

import com.mindtree.PYT.Entities.Room;

import java.util.List;
import java.util.Optional;

public interface RoomService {

    void addRoom(Room room);

    List<Room> getAllRoom();

    List<Room> getAllAvailableRooms();

    Optional<Room> getRoomById(long roomId);

    void updateRoom(long roomId,Room room);

    void deleteRoom(long roomId);
}
