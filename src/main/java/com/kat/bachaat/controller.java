package com.kat.bachaat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class controller {

    @GetMapping("/greet")
    public String hello(){
        return "hello";
    }

    @GetMapping
    public String hi(){
        return "hi";
    }
}
