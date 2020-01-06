package com.surasint.example.scheduler;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class Scheduler1 {

//    @Scheduled(fixedDelay = 1000)
    @Scheduled(fixedDelayString = "${schduler.test1}")
    public void test1(){
        System.out.println("test1");
    }
}
