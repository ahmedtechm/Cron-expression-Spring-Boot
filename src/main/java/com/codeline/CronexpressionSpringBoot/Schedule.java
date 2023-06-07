package com.codeline.CronexpressionSpringBoot;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {

    //@Scheduled(cron = "* * * * * *")
//    public void scheduleMessage() {
//        System.out.println("Welcome to Spring Boot Project");
//    }


    //Problem 1: Write a CRON expression that runs a job every five minutes.
    @Scheduled(cron = "0 */5 * * * *")
    public void scheduleTask_1() {
        System.out.println("Executed task Every 5 minutes");
    }

    //Problem 2: Write a CRON expression that runs a job every hour.
    @Scheduled(cron = "0 0 * * * *")
    public void scheduleTask_2() {
        System.out.println("Executed task Every hour");
    }
}
