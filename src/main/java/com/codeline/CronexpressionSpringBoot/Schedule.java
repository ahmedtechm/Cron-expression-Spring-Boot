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

    //Problem 14: Write a CRON expression that runs a job every 5 minutes on weekdays and every 15 minutes on weekends.
    @Scheduled(cron = "0 */5 * * * 1-5")
    public void runOnWeekdays_14() {
        System.out.println("Executed task every 5 minutes on weekdays ");
    }
    @Scheduled(cron = "0 */15 * * * 0,6 ")
    public void runJobOnWeekends_14() {
        System.out.println("Executed task every 15 minutes on weekends ");
    }

    //Problem 15: Write a CRON expression that runs a job every 10 minutes but only between 9:00 AM and 6:00 PM on weekdays.
    @Scheduled(cron = " 0 */10 9-17 * * 0-4 ")
    public void scheduleTask_15() {
        System.out.println("Executed task Every 10 minutes, between 09:00 AM and 05:59 PM, Sunday through Thursday");
    }

    //Problem 16: Write a CRON expression that runs a job every hour during the first half of the month.
    @Scheduled(cron = " 0 0 * 1-15 * * ")
    public void scheduleTask_16() {
        System.out.println("Executed task Every hour, between day 1 and 15 of the month");
    }

    //Problem 17: Write a CRON expression that runs a job every 5 minutes on weekdays and every 15 minutes on weekends.
    @Scheduled(cron = "0 */5 * * * 0-4")
    public void runOnWeekdays_17() {
        System.out.println("Executed task Every 5 minutes, Sunday through Thursday ");
    }
    @Scheduled(cron = " 0 */15 * * * 5-6 ")
    public void runJobOnWeekends_17() {
        System.out.println("Executed task Every 15 minutes, Friday through Saturday ");
    }

    //Problem 18: Write a CRON expression that runs a job at 11:30 PM every Friday the 13th.
    @Scheduled(cron = " 0 30 23 13 * 5 ")
    public void scheduleTask_18() {
        System.out.println("Executed task At 11:30 PM, on day 13 of the month, and on Friday");
    }

    //Problem 19: Write a CRON expression that runs a job every hour but only on even-numbered days of the month.
    @Scheduled(cron = " 0 0 * 2-30/2 * * ")
    public void scheduleTask_19() {
        System.out.println("Executed task Every hour, every 2 days, between day 2 and 30 of the month");
    }

    //Problem 20: Write a CRON expression that runs a job every 5 minutes but only between 9:00 AM and 6:00 PM on weekends.
    @Scheduled(cron = " 0 */5 9-17 * * 5,6 ")
    public void scheduleTask_20() {
        System.out.println("Executed task Every 5 minutes, between 09:00 AM and 05:59 PM, only on Friday and Saturday");
    }

    //Problem 21: Write a CRON expression that runs a job at 3:30 AM every day except Saturday and Sunday.
    @Scheduled(cron = " 0 30 3 * * 1-5 ")
    public void scheduleTask_21() {
        System.out.println("Executed task At 03:30 AM, Monday through Friday");
    }

    //Problem 22: Write a CRON expression that runs a job at the top of every hour between 9:00 AM and 5:00 PM on the 15th day of the month.
    @Scheduled(cron = " 0 0 9-16 15 * * ")
    public void scheduleTask_22() {
        System.out.println("Executed task Every hour, between 09:00 AM and 04:59 PM, on day 15 of the month");
    }

    //Problem 23: Write a CRON expression that runs a job at 8:15 AM every weekday except Friday.
    @Scheduled(cron = " 0 15 8 * * 1-4,6 ")
    public void scheduleTask_23() {
        System.out.println("Executed task At 08:15 AM, only on Monday through Thursday and Saturday");
    }

    //Problem 24: Write a CRON expression that runs a job at 10:00 PM every day in the month of December.
    @Scheduled(cron = " 0 0 22 * 12 * ")
    public void scheduleTask_24() {
        System.out.println("Executed task At 10:00 PM, only in December ");
    }

    //Problem 25: Write a CRON expression that runs a job at the bottom of every hour (i.e., at :00 and :30 minutes past the hour) between 6:00 PM and midnight on weekdays.
    @Scheduled(cron = " 0 0,30 18-23 * * 1-5 ")
    public void scheduleTask_25() {
        System.out.println("Executed task At 0 and 30 minutes past the hour, between 06:00 PM and 11:59 PM, Monday through Friday ");
    }

    //Problem 26: Write a CRON expression that runs a job at 4:30 PM on the 1st and 15th days of every month.
    @Scheduled(cron = " 0 30 16 1,15 * * ")
    public void scheduleTask_26() {
        System.out.println("Executed task At 04:30 PM, on day 1 and 15 of the month ");
    }

    //Problem 27: Write a CRON expression that runs a job every 10 minutes on weekdays between 9:00 AM and 5:00 PM.
    @Scheduled(cron = " 0 */10 9-16 * * 1-5 ")
    public void scheduleTask_27() {
        System.out.println("Executed task Every 10 minutes, between 09:00 AM and 04:59 PM, Monday through Friday ");
    }

    //Problem 28: Write a CRON expression that runs a job at 12:00 PM on the 3rd Wednesday of every month.
    @Scheduled(cron = " 0 0 12 * * 3#3 ")
    public void scheduleTask_28() {
        System.out.println("Executed task At 12:00 PM, on the third Wednesday of the month ");
    }

    //Problem 29: Write a CRON expression that runs a job at 10:00 PM every Sunday in the months of July, August, and September.
    @Scheduled(cron = " 0 0 22 * 7-9 0 ")
    public void scheduleTask_29() {
        System.out.println("Executed task At 10:00 PM, only on Sunday, July through September ");
    }

    //Problem 30: Write a CRON expression that runs a job at 12:00 PM every day except Sunday in the month of July.
    @Scheduled(cron = " 0 0 12 * 7 1-6 ")
    public void scheduleTask_30() {
        System.out.println("Executed task At 12:00 PM, Monday through Saturday, only in July ");
    }

    //Problem 31: Write a CRON expression that runs a job at 11:30 PM every Friday.
    @Scheduled(cron = " 0 30 23 * * 5 ")
    public void scheduleTask_31() {
        System.out.println("Executed task At 11:30 PM, only on Friday ");
    }

    //Problem 32: Write a CRON expression that runs a job at 3:15 AM every day.
    @Scheduled(cron = " 0 15 3 * * * ")
    public void scheduleTask_32() {
        System.out.println("Executed task At 03:15 AM ");
    }

    //Problem 33: Write a CRON expression that runs a job every hour from 6:00 AM to 8:00 PM on weekdays.
    @Scheduled(cron = " 0 0 6-20 * * 1-5 ")
    public void scheduleTask_33() {
        System.out.println("Executed task Every hour, between 06:00 AM and 08:59 PM, Monday through Friday ");
    }

    //Problem 34: Write a CRON expression that runs a job every 30 minutes on the 15th and 30th day of every month.
    @Scheduled(cron = " 0 */30 * 15,30 * * ")
    public void scheduleTask_34() {
        System.out.println("Executed task Every 30 minutes, on day 15 and 30 of the month ");
    }

    //Problem 35: Write a CRON expression that runs a job every 5 minutes on the 1st day of every month.
    @Scheduled(cron = " 0 */5 * 1 * * ")
    public void scheduleTask_35() {
        System.out.println("Executed task Every 5 minutes, on day 1 of the month ");
    }

    //Problem 36: Write a CRON expression that runs a job every hour on the hour from 9:00 AM to 5:00 PM on weekdays.
    @Scheduled(cron = " 0 0 9-17 * * 1-5 ")
    public void scheduleTask_36() {
        System.out.println("Executed task Every hour, between 09:00 AM and 05:59 PM, Monday through Friday ");
    }

    //Problem 37: Write a CRON expression that runs a job every 15 minutes from 2:00 PM to 10:00 PM on weekends.
    @Scheduled(cron = " 0 */15 14-22 * * 6,7 ")
    public void scheduleTask_37() {
        System.out.println("Executed task Every 15 minutes, between 02:00 PM and 10:59 PM, only on Saturday and Sunday ");
    }
}
