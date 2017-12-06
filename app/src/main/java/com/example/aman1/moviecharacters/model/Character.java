package com.example.aman1.moviecharacters.model;

/**
 * Created by aman1 on 05/12/2017.
 */

public class Character {
    private String name;
    private String text;
    private Icon icon;


    public Character(String name, String text, Icon icon) {
        this.name = name;
        this.text = text;
        this.icon = icon;
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

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

}
