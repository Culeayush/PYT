package com.mindtree.PYT.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Optional;

@Document(collection = "Rooms")
public class Room {
    @Id
    @NotNull(message="Room ID cannot be null")
    @Size(min=4,message="Room ID should be minimum 4 digits")
    private long roomId;
    @Field
    @NotNull(message="Hotel name cannot be null")
    @Size(min=8,message="Hotel name should be minimum 8 digits")
    private String hotelName;
    @Field
    @NotNull(message="Room rent cannot be null")
    private double roomRent;
    @Field
    private boolean isAvailable;
    @Field
    private Date checkOut;

    public Room() {
    }

    public Room(@NotNull(message="Room ID cannot be null") @Size(min=4,message="Room ID should be minimum 4 digits")long roomId
            ,@NotNull(message="Hotel name cannot be null") @Size(min=8,message="Hotel name should be minimum 8 digits") String hotelName
            ,@NotNull(message="Room rent cannot be null") double roomRent
            ,boolean isAvailable
            ,Date checkOut) {
        this.roomId = roomId;
        this.hotelName = hotelName;
        this.roomRent = roomRent;
        this.isAvailable = isAvailable;
        this.checkOut = checkOut;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public double getRoomRent() {
        return roomRent;
    }

    public void setRoomRent(double roomRent) {
        this.roomRent = roomRent;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNo=" + roomId +
                ", hotelName='" + hotelName + '\'' +
                ", roomRent=" + roomRent +
                '}';
    }
}
