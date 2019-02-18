package com.mainacad.Inheritance;

public class Cat extends Animal{

    public Cat(int height, String color) {
        super(height, color);
        setMessage("Meow");
    }

    @Override
    public String toString(){
        return super.toString() + "Meow, Meow";
    }
}
