package com.mindtree.PYT.Entities;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Component;

@Document(collection = "Users")
public class User {
    @Id
    private String userID;
    @Field
    private String userName;
    @Field
    private boolean admin;
    @Field
    private String userPassword;

    public User() {
    }


    public User(String userID, String userName, boolean admin, String userPassword) {
        this.userID = userID;
        this.userName = userName;

        this.admin = admin;
        this.userPassword = userPassword;
    }

    public String getUserID() {return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }





    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}