package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Slf4j
public class ScheduledTask {
    @Scheduled(cron = "0/5 51-59 11-12 * * *")
    public void Schedule() {
//        System.out.println("Scheduled job ");
        log.info("Scheduled Task at time: "+LocalDateTime.now());
    }
}
