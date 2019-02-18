package com.mainacad.Inheritance;

public class Dog {

    private int height;
    private String color;
    private String message = "Woof";

    public Dog(int height, String color) {
        this.height = height;
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String say() {
        return message;
    }

}
