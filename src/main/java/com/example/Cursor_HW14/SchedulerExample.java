package com.example.Cursor_HW14;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class SchedulerExample {

    @Scheduled(cron = "*/1 * * * * *") //Format: second, minute, hour, day, month, day of the week
    public void reportCurrentData() {
        System.out.println("Scheduler working: " + new Date());
    }
}