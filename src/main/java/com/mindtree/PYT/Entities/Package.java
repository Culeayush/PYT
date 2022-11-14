package com.mindtree.PYT.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Packages")
public class Package {
    @Id
    private long packageID;
    @Field
    private String packageName;
    @Field
    private Flight flight;
    @Field
    private Room room;
    @Field
    private String packageCost;

    public Package(long packageID, String packageName, Flight flight, Room room, String packageCost) {
        this.packageID = packageID;
        this.packageName = packageName;
        this.flight = flight;
        this.room = room;
        this.packageCost = packageCost;
    }

    public long getPackageID() {
        return packageID;
    }

    public void setPackageID(long packageID) {
        this.packageID = packageID;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getPackageCost() {
        return packageCost;
    }

    public void setPackageCost(String packageCost) {
        this.packageCost = packageCost;
    }

    @Override
    public String toString() {
        return "Package{" +
                "packageID=" + packageID +
                ", packageName='" + packageName + '\'' +
                ", flight=" + flight +
                ", room=" + room +
                ", packageCost='" + packageCost + '\'' +
                '}';
    }
}
