package com.example.day03greetingapp.controller;

import com.example.day03greetingapp.entity.Greeting;
import com.example.day03greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello %s !";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name") String name){
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @GetMapping(value = {"/{id}"})
    public Greeting greetingById(@PathVariable("id") Long id){
        return greetingService.getGreetingById(id);
    }
}
