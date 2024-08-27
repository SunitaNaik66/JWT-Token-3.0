package com.jwt.controller;


import com.jwt.models.User;
import com.jwt.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserServices userServices;


    //http://localhost:9090/home/user
    @GetMapping("/user")
    public List<User> getUser(){
        System.out.println("getting users");
        return userServices.getUsers();
    }
}
