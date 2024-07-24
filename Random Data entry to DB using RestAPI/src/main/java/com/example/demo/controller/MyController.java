package com.example.demo.controller;

import com.example.demo.services.Parser;
import com.example.demo.services.RandomDataGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private RandomDataGenerator ran;

    @Autowired
    private Parser parse;

    @GetMapping("/")
    public String homePage(){
        return "The controller is started";
    }

    @GetMapping("/generateRandomData")
    public String randomDataGenerator() {
        ran.randomData();
        return "Random data file is created on the path D:\\SpringProject\\Random Data entry to DB\\src\\main\\resources";
    }

    @GetMapping("/parseIntoDB")
    public String parseIntoDB(){
        parse.parseCSV();
        return "Parsed Random data CSV file is inserted into DataBase";
    }
}
