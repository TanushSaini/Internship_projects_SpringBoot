package com.example.demo.controller;

import com.example.demo.entities.UserEntries;
import com.example.demo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController{

    @Autowired
    private UserServices userServices;

    @RequestMapping("/")
    public static String blank(){
        return "This is the homepage";
    }

    //Get all the entries from the table
    @GetMapping("/entries")
    public List<UserEntries> getEntry(){
        return this.userServices.getEntry();
    }

    //Insert an entry into the table
    @PostMapping("/addEntry")
    public UserEntries addEntry(@RequestBody UserEntries userEntries){
        return this.userServices.addEntry(userEntries);
    }
}
