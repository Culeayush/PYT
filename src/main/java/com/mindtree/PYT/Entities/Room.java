package com.mindtree.PYT.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Repository;

@Repository
public class Room {

    @Id
    private int roomNo;
    @Field
    private String roomType;
    @Field
    private double roomRent;


    public Room() {
    }

    public Room(int roomNo, String roomType, double roomRent) {
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
