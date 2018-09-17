package com.greenfoxacademy.helloworld;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    private long id;
    private String content;
    static AtomicLong currentID = new AtomicLong(0);

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static AtomicLong getCurrentID() {
        return currentID;
    }

    public void setCurrentID(AtomicLong currentID) {
        Greeting.currentID = currentID;
    }
}
