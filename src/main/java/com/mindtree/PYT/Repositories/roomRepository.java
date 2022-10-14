package com.mindtree.PYT.Repositories;

import java.util.ArrayList;

public interface roomRepository {
    Rooms addRoom(int roomNo,String roomType,int roomRent);
    Rooms updateRoom(int roomNo,String roomType,int roomRent);
    Rooms deleteRoom(int roomNo);
    ArrayList<Rooms> viewAllRooms();
}
