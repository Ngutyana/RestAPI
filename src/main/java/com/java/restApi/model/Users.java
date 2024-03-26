package com.java.restApi.model;

public class Users {

    private String userID;
    private String userName;
    private String userSurname;
    private String userEmail;


    public Users() {
    }

    public Users(String userID, String userName, String userSurname, String userEmail) {
        this.userID = userID;
        this.userName = userName;
        this.userSurname = userSurname;
        this.userEmail = userEmail;
    }

    public String getUserID() {
        return userID;
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

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

}
