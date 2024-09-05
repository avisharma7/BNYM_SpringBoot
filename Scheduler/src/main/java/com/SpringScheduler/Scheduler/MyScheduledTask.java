package com.SpringScheduler.Scheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyScheduledTask {
    @Scheduled(fixedRate = 5000)
    public void runTask(){
        System.out.println("Running scheduled tasks in every 5sec");
    }
}
