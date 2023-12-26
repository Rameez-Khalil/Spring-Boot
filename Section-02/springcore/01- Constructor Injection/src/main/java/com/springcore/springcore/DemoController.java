package com.springcore.springcore;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
   //Define private field for dependency.
    private Coach  myCoach;

    //Dependency injection.
    //This autowired constructor is optional since we only have one constructor.
    @Autowired
    public DemoController(Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping(path = "/dailyworkouts")
    public String show(){
       return myCoach.getDailyWorkouts();
    }




}
