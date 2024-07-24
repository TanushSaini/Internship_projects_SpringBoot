package com.example.demo.controller;

import com.example.demo.services.Parser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private Parser p;
    @GetMapping("/")
    public String entryToDB(){
        p.entry();
        return "Controller Started";
    }
}
