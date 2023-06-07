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

    //Problem 7: Write a CRON expression that runs a job every 15 minutes between 8:00 AM and 10:45 PM every day.
    @Scheduled(cron = " 0 */15 8-22 * * * ")
    public void scheduleTask_7() {
        System.out.println("Executed task Every 15 minutes, between 08:00 AM and 10:59 PM ");
    }

    //Problem 8: Write a CRON expression that runs a job every hour on weekdays between 9:00 AM and 5:00 PM.
    @Scheduled(cron = "0 0 9-16 * * 1-5")
    public void scheduleTask_8() {
        System.out.println("Executed task Every hour, between 09:00 AM and 04:59 PM, Monday through Friday ");
    }

    //Problem 9: Write a CRON expression that runs a job every day at 3:00 AM.
    @Scheduled(cron = " 0 0 3 * * * ")
    public void scheduleTask_9() {
        System.out.println("Executed task At 03:00 AM ");
    }

    // Problem 10: Write a CRON expression that runs a job every hour during the month of January.
    @Scheduled(cron = " 0 0 * * 1 * ")
    public void scheduleTask_10() {
        System.out.println("Executed task Every hour, only in January ");
    }

    //Problem 11: Write a CRON expression that runs a job every 30 minutes during business hours (8:00 AMto 5:00 PM) on weekdays.
    @Scheduled(cron = " 0 */30 8-16 * * 0-4 ")
    public void scheduleTask_11() {
        System.out.println("Executed task Every 30 minutes, between 08:00 AM and 04:59 PM, Sunday through Thursday ");
    }

    //Problem 12: Write a CRON expression that runs a job every hour on the 15th day of the month.
    @Scheduled(cron = " 0 0 * 15 * * ")
    public void scheduleTask_12() {
        System.out.println("Executed task Every hour, on day 15 of the month ");
    }

    //Problem 13: Write a CRON expression that runs a job every day at 6:00 PM during daylight saving time(DST) in the United States.
    @Scheduled(cron = "0 0 18 ? 3-10 *")
    public void scheduleTask_13() {
        System.out.println("Executed task At 06:00 PM, March through October ");
    }
}
