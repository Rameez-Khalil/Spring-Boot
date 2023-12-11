package com.springboot.demo.App01.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${best.name}")
    private String name;


    @GetMapping("/") //exposing route "/"
    public String hello() {
        return "Hello  " + name + " , you are the besta";
    }

    @GetMapping("/hellotest")
    public String test(){
        return "Just testingssa";
    }
}
