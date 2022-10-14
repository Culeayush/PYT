package com.mindtree.PYT.Repositories;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Repository;

@Repository
public class Rooms {

    @Id
    private int roomNo;
    @Field
    private String roomType;
    @Field
    private double roomRent;


    public Rooms() {
    }

    public Rooms(int roomNo, String roomType, double roomRent) {
        this.roomNo = roomNo;
        this.roomType = roomType;

        this.roomRent = roomRent;

    }


    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }


    public double getRoomRent() {
        return roomRent;
    }

    public void setRoomRent(double roomRent) {
        this.roomRent = roomRent;
    }


}
