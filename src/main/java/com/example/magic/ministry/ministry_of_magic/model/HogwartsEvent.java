package com.example.magic.ministry.ministry_of_magic.model;

import jakarta.persistence.*;

@Entity
public class HogwartsEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String subject;
    @Column( length = 100000 )
    String message;

    public HogwartsEvent() {
    }

    public HogwartsEvent(String subject, String message) {
        this.subject = subject;
        this.message = message;
    }

    public HogwartsEvent(Integer id, String subject, String message) {
        this.id = id;
        this.subject = subject;
        this.message = message;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HogwartsEvent{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
