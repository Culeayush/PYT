package com.mindtree.PYT.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Document(collection = "Users")
public class User {
    @Id
    @NotNull(message="UserID cannot be null")
    @Size(min=4,message="UserID should be at least 4 digits")
    private long userID;
    @Field
    @NotNull(message="User name cannot be null")
    @Size(min=8,message="User name should be at least 8 digits")
    private String userName;
    @Field
    @NotNull(message="boolean cannot be null")
    private boolean admin;
    @Field
    @NotNull(message="Password cannot be null")
    @Size(min=8,message="Password should be at least 8 digits")
    private String userPassword;

    public User() {
    }


    public User(@NotNull(message="UserID cannot be null") @Size(min=4,message="UserID should be at least 4 digits") long userID
            ,@NotNull(message="User name cannot be null") @Size(min=8,message="User name should be at least 8 digits")String userName
            ,@NotNull(message="boolean cannot be null") boolean admin
            ,@NotNull(message="Password cannot be null") @Size(min=8,message="Password should be at least 8 digits") String userPassword) {
        this.userID = userID;
        this.userName = userName;
        this.admin = admin;
        this.userPassword = userPassword;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
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

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", userName='" + userName + '\'' +
                ", admin=" + admin +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}