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

    //Problem 3: Write a CRON expression that runs a job every day at 2:30 PM.
    @Scheduled(cron = " 0 30 14 * * * ")
    public void scheduleTask_3() {
        System.out.println("Executed task At 02:30 PM");
    }

    //Problem 4: Write a CRON expression that runs a job every Monday at 8:00 AM.
    @Scheduled(cron = " 0 0 8 * * 1 ")
    public void scheduleTask_4() {
        System.out.println("Executed task At 08:00 AM, only on Monday");
    }

    //Problem 5: Write a CRON expression that runs a job every month on the first day of the month at 3:00 AM.
    @Scheduled(cron = " 0 0 3 1 * * ")
    public void scheduleTask_5() {
        System.out.println("Executed task At 03:00 AM, on day 1 of the month");
    }

    //Problem 6: Write a CRON expression that runs a job every Sunday at 7:30 PM and 10:30 PM.
    @Scheduled(cron = " 0 30 19,22 * * 0 ")
    public void scheduleTask_6() {
        System.out.println("Executed task At 07:30 PM and 10:30 PM, only on Sunday ");
    }
}
