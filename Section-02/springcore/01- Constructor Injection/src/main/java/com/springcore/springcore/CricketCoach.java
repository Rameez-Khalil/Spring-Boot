package com.springcore.springcore;


import org.springframework.stereotype.Component;

@Component //Spring Bean.
public class CricketCoach implements Coach{
    @Override
     public String getDailyWorkouts(){
        return "Fast Bowling for 15 minutes";
    }
}
