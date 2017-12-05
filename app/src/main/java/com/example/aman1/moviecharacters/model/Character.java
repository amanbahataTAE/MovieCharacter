package com.example.aman1.moviecharacters.model;

/**
 * Created by aman1 on 05/12/2017.
 */

public class Character {
    private String name;
    private String text;

    public Character(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
