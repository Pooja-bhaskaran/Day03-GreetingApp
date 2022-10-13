package com.example.day03greetingapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "Greeting_User")
public class Greeting {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String message;

    public Greeting(long id, String name) {
        this.id=id;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
