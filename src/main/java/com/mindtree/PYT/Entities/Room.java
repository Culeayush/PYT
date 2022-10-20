package com.mindtree.PYT.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Document(collection = "Rooms")
public class Room {
    @Id
    @NotNull(message="Room ID cannot be null")
    @Size(min=4,message="Room ID should be minimum 4 digits")
    private long roomId;

    @Field
    private String location;
    @Field
    @NotNull(message="Hotel name cannot be null")
    @Size(min=8,message="Hotel name should be minimum 8 digits")
    private String hotelName;
    @Field
    @NotNull(message="Room rent cannot be null")
    private double roomRent;
    @Field
    private boolean available;

    @Field
    private Date checkIn;
    @Field
    private Date checkOut;

    public Room() {
    }

    public Room(@NotNull(message = "Room ID cannot be null") @Size(min = 4, message = "Room ID should be minimum 4 digits") long roomId
            , String location, @NotNull(message="Hotel name cannot be null") @Size(min=8,message="Hotel name should be minimum 8 digits") String hotelName
            , @NotNull(message = "Room rent cannot be null") double roomRent
            , boolean available
            , Date checkIn, Date checkOut) {
        this.roomId = roomId;
        this.location = location;
        this.hotelName = hotelName;
        this.roomRent = roomRent;
        this.available = available;
        this.checkIn = checkIn;
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
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", location='" + location + '\'' +
                ", hotelName='" + hotelName + '\'' +
                ", roomRent=" + roomRent +
                ", available=" + available +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                '}';
    }
}
