package com.example.helloworld.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

import java.util.ArrayList;
import java.util.List;

public class Saying {
    private long id;

    @Length(max = 3)
    private String content;

    private List<String> history;

    public Saying() {
        // Jackson deserialization
    }

    public Saying(long id, String content) {
        this.id = id;
        this.content = content;
        this.history = new ArrayList<>();
    }

    public Saying(long id, String content, List<String> history) {
        this.id = id;
        this.content = content;
        this.history = history;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }

    @JsonProperty
    public List<String> getHistory() {
        return history;
    }
}