package com.Second_Spring_Project_0223.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    String getTest(){
        return "This is a String from second micro service";
    }


}
