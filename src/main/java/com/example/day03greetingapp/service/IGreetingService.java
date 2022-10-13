package com.example.day03greetingapp.service;

import com.example.day03greetingapp.entity.Greeting;
import com.example.day03greetingapp.entity.User;

public interface IGreetingService {
    Greeting addGreeting(User user);
    Greeting getGreetingById(long id);
}
