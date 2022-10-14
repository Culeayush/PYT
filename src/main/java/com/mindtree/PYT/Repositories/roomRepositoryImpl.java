package com.mindtree.PYT.Repositories;

import com.mindtree.PYT.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Objects;

public class roomRepositoryImpl implements roomRepository{

    private User user;
    @Autowired
    private ArrayList<Rooms> rlist ;

    public roomRepositoryImpl(){

        rlist = new ArrayList<>();
        user = new User();
    }

    @Override
    public Rooms addRoom(int roomNo, String roomType, int roomRent) {

        if(!user.isAdmin())
            return null;

        Rooms roomObj = new Rooms(roomNo,roomType,roomRent);
        rlist.add(roomObj);
        return roomObj;
    }

    @Override
    public Rooms updateRoom(int roomNo, String roomType, int roomRent) {
        if(!user.isAdmin())
            return null;
        Rooms roomObj = new Rooms(roomNo,roomType,roomRent);
        for(int i=0;i< rlist.size();i++){
            if(Objects.equals(rlist.get(i).getRoomNo(),roomNo)) {
                rlist.set(i,roomObj);
            }
        }
        return roomObj;
    }

    @Override
    public Rooms deleteRoom(int roomNo) {
        if(!user.isAdmin())
            return null;
        Rooms roomObj = null ;
        for(int i=0;i< rlist.size();i++){
            if(Objects.equals(rlist.get(i).getRoomNo(),roomNo)) {
                roomObj = rlist.remove(i);
            }
        }
        return roomObj;
    }

    @Override
    public ArrayList<Rooms> viewAllRooms() {
        if(!user.isAdmin())
            return null;

        return rlist;
    }
}
