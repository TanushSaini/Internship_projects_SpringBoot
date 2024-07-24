package com.example.demo.scheduler;

import com.example.demo.entity.DBTable;
import com.example.demo.services.Dao;
import com.example.demo.services.Parser;
import com.example.demo.services.RandomDataGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class Scheduler {
    @Autowired
    RandomDataGenerator ran;
    @Autowired
    Parser parse;
    @Autowired
    Dao d;

    @Scheduled(cron = "0 */10 * * * *")
    public void createFile() {
        ran.randomData();
}

    @Scheduled(cron = "10 */10 * * * *")
    public void parseFile() {
        parse.parseCSV();
    }

    @Scheduled(cron = "20 */10 * * * *")
    public void printData(){
        List<DBTable> row = d.getAll();
        System.out.println(row);
    }
}
