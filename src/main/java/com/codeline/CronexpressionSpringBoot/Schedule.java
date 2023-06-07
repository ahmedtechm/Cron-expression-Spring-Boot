package com.codeline.CronexpressionSpringBoot;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled(cron = "* * * * * *")
    public void scheduleMessage() {
        System.out.println("Welcome to Spring Boot Project");
    }
}
