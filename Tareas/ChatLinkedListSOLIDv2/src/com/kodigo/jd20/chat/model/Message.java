package com.kodigo.jd20.chat.model;

import java.time.LocalDateTime;

public class Message {
    private final User sender;
    private final String content;
    private final LocalDateTime timeStamp;

    public Message(User sender, String content) {
        this.sender = sender;
        this.content = content;
        this.timeStamp = LocalDateTime.now();
    }

    public User getSender() {
        return sender;
    }
    public String getContent() {
        return content;
    }
    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }
}


