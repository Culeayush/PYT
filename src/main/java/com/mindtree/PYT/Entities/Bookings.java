package com.mindtree.PYT.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class Bookings {
    @Id
    private long packageID;
    @Field
    private String packageName;
    @Field
    private String packageCost;

    public Bookings() {
    }

    public Bookings(long packageID, String packageName, String packageCost) {
        this.packageID = packageID;
        this.packageName = packageName;
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

    public String getPackageCost() {
        return packageCost;
    }

    public void setPackageCost(String packageCost) {
        this.packageCost = packageCost;
    }

    @Override
    public String toString() {
        return "Bookings{" +
                "packageID=" + packageID +
                ", packageNam='" + packageName + '\'' +
                ", packageCost='" + packageCost + '\'' +
                '}';
    }
}
