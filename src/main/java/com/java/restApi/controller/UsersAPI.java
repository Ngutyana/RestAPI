package com.java.restApi.controller;

import  com.java.restApi.model.Users;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UsersAPI
{
    Users users;

    @GetMapping("{userName}")  //getting user data using userID(unique)
    public Users getUserData(String userID)
    {
        return //users;

                new Users("jsmith", "John", "Smith");
    }

    @PostMapping  //creating new user data
    public String createUserData(@RequestBody Users users)
    {
        this.users = users;
        return "User created successfully";
    }
    @PutMapping  //updating user data
    public String updateUserData(@RequestBody Users users)
    {
        this.users = users;
        return "User data updated successfully";
    }

    @DeleteMapping("{userName}")  //deleting a user
    public String deleteUserData(String userID)
    {
        this.users = null;
        return "User deleted successfully";
    }

}
