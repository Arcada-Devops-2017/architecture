package com.example.restful;

public class orders {
    private final long id;
    private final String content;

    public orders(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
