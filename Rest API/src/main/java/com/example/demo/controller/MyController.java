package com.example.demo.controller;

import com.example.demo.controller.entities.UserDetails;
import com.example.demo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private UserServices userServices;

    @GetMapping("/home")
    public static String request(){
        return "Controller Started";
    }

    //get user data from the table
    @GetMapping("/userDetails")
    public List<UserDetails> getDetails(){
        return this.userServices.getDetails();
    }
}
