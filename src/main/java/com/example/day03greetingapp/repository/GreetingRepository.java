package com.example.day03greetingapp.repository;

import com.example.day03greetingapp.entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {
}
