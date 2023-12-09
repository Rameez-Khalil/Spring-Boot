package com.springboot.demo.App01.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/") //exposing route "/"
    public String hello() {
        return "Hello Rameez, you are the best";
    }
}
