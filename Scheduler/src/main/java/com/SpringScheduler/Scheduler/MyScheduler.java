package com.SpringScheduler.Scheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
@Slf4j


public class MyScheduler {
    //cron expression
    @Scheduled(cron = "*/5 * * * * * ") //sec min hour day months week days
    public void sayHello() throws InterruptedException{
        log.info("Hello world....");
    }
}
