package com.batch.demoappliaction;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {

    @RequestMapping("/hello")
    public String sayhello() {

        return "hello java String boot";

    }

    @RequestMapping("/hi")
    public String hello() {

        return "hello java";


    }
}






