package com.java.restApi.controller;

import  com.java.restApi.model.Users;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UsersAPI
{
    Users users;

    @GetMapping("{userID}")  //getting user data using userID(unique)
    public Users getUserData(String userID)
    {
        return users;

                /*new Users("01",
                "Unathi",
                "Ngutyana",
                "ungutyana@gmail.com",
                "xxx");*/
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

    @DeleteMapping("{userID}")  //deleting a user
    public String deleteUserData(String userID)
    {
        this.users = null;
        return "User deleted successfully";
    }

}
