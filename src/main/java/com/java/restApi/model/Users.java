package com.java.restApi.model;

public class Users {

    private String userID;
    private String userName;
    private String userSurname;
    private String userEmail;
    private String userTasks;


    public Users() {
    }

    public Users(String userID, String userName, String userSurname, String userEmail, String userTasks) {
        this.userID = userID;
        this.userName = userName;
        this.userSurname = userSurname;
        this.userEmail = userEmail;
        this.userTasks = userTasks;
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
    public String getUserTasks() {
        return userTasks;
    }

    public void setUserTasks(String userTasks) {
        this.userTasks = userTasks;
    }

}
