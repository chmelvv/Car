package com.mainacad.Inheritance;

public class Cat extends Animal{

    public Cat(int height, String color) {
        super(height, color);
        setMessage("Meow");
    }
}
