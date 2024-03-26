package com.java.restApi.controller;

import  com.java.restApi.model.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UsersAPI
{
    @GetMapping("{userID}")
    public Users getUserData(String userID)
    {
        return new Users("01","Unathi","Ngutyana","xxx");
    }

}
